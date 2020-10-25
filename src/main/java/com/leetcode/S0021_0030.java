package com.leetcode;

import com.leetcode.lang.Mark;
import com.leetcode.lang.Solution;
import com.leetcode.util.ListNode;

@Solution
public class S0021_0030 {
    @Mark(order = 21, name = "merge-two-sorted-lists", description = "合并两个有序链表")
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        var result = new ListNode();
        var head = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1 == null) head.next = l2;
        else head.next = l1;
        return result.next;
    }

    @Mark(order = 26, name = "remove-duplicates-from-sorted-array", description = "删除排序数组中的重复项")
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        var p = 1;
        for (int i = 1, last = nums[0]; i < nums.length; i++) {
            if (nums[i] != last) {
                last = nums[i];
                nums[p++] = last;
            }
        }
        return p;
    }

    @Mark(order = 27, name = "remove-element", description = "移除元素")
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        var p = 0;
        for (int i = 0; i < nums.length; i++) if (nums[i] != val) nums[p++] = nums[i];
        return p;
    }

    @Mark(order = 28, name = "implement-strstr", description = "实现 strStr()")
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        final var haystackLength = haystack.length();
        final var needleLength = needle.length();
        if (haystackLength < needleLength) return -1;
        if (haystackLength == needleLength) return haystack.equals(needle) ? 0 : -1;
        for (int i = 0; i < haystackLength - needleLength + 1; i++)
            if (haystack.substring(i, i + needleLength).equals(needle)) return i;
        return -1;
    }

    @Mark(order = 29, name = "divide-two-integers", description = "两数相除")
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        boolean positive = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;
        int result = divideRecursion(dividend < 0 ? dividend : -dividend, divisor < 0 ? divisor : -divisor);
        return positive ? result : -result;
    }

    private int divideRecursion(int dividend, int divisor) {
        if (dividend > divisor) return 0;
        var i = 1;
        var divisorTemp = divisor;
        while (dividend - divisorTemp < divisorTemp) {
            divisorTemp += divisorTemp;
            i += i;
        }
        return i + divideRecursion(dividend - divisorTemp, divisor);
    }
}
