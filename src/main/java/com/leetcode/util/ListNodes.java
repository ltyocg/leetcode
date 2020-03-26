package com.leetcode.util;

import java.util.LinkedHashSet;

/**
 * {@link ListNode}工具类
 */
public final class ListNodes {
    private ListNodes() {
    }

    /**
     * 创建单向链表
     *
     * @param nums 各节点的{@code val}值
     * @return 单向链表头
     */
    public static ListNode build(final int[] nums) {
        return build(nums, -1);
    }

    /**
     * 创建有环的单向链表
     *
     * @param nums 各节点的{@code val}值
     * @param pos  环的入口节点位置
     * @return 有环的单向链表头
     * @throws IllegalArgumentException {@code pos}必须小于链表节点数
     */
    public static ListNode build(final int[] nums, final int pos) {
        if (nums.length == 0) return null;
        if (pos >= nums.length) throw new IllegalArgumentException("The pos must smaller then nums' size.");
        final var l = new ListNode(nums[0]);
        ListNode pointer = l, encounter = null;
        if (pos == 0) encounter = l;
        for (var i = 1; i < nums.length; i++, pointer = pointer.next) {
            pointer.next = new ListNode(nums[i]);
            if (i == pos) encounter = pointer.next;
        }
        if (encounter != null) pointer.next = encounter;
        return l;
    }

    /**
     * 单向链表转数组
     * 成环的情况不会重复记录元素
     *
     * @param head 链表头
     * @return 数组
     */
    public static int[] toIntArray(final ListNode head) {
        return toLinkedHashSet(head).stream().mapToInt(node -> node.val).toArray();
    }

    /**
     * 获取索引对应的节点
     * 成环的情况不会重复记录元素
     *
     * @param head  链表头
     * @param index 索引
     * @return 索引对应的节点
     * @throws IndexOutOfBoundsException 索引超出链表长度范围
     */
    public static ListNode get(final ListNode head, final int index) {
        var i = 0;
        final var listNodes = toLinkedHashSet(head);
        for (ListNode listNode : listNodes)
            if (i++ == index) return listNode;
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listNodes.size());
    }

    private static LinkedHashSet<ListNode> toLinkedHashSet(ListNode head) {
        final var nodeSet = new LinkedHashSet<ListNode>();
        while (head != null && nodeSet.add(head))
            head = head.next;
        return nodeSet;
    }
}
