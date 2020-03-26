package com.leetcode;

import com.leetcode.lang.Mark;
import com.leetcode.util.ListNode;

public class S0141_0150 {
    @Mark(order = 141, name = "linked-list-cycle", description = "环形链表")
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head, fast = head;
        do {
            if ((slow = slow.next) == null) return false;
            if ((fast = fast.next) == null) return false;
            if ((fast = fast.next) == null) return false;
        } while (slow != fast);
        return true;
    }

    @Mark(order = 142, name = "linked-list-cycle-ii", description = "环形链表 II")
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        do {
            if ((slow = slow.next) == null) return null;
            if ((fast = fast.next) == null) return null;
            if ((fast = fast.next) == null) return null;
        } while (slow != fast);
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
