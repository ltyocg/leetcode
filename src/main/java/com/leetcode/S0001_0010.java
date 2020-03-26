package com.leetcode;

import com.leetcode.lang.Mark;
import com.leetcode.util.ListNode;

import java.util.HashMap;

public class S0001_0010 {
    @Mark(order = 1, name = "two-sum", description = "两数之和")
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < nums.length; i++) {
            var complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    @Mark(order = 2, name = "add-two-numbers", description = "两数相加")
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int r = 0;
        ListNode p = l1, t;
        do {
            r += p.val + l2.val;
            p.val = r % 10;
            r /= 10;
            if (p.next == null && r == 1) {
                p.next = new ListNode(1);
                r = 0;
            }
            t = p;
            p = p.next;
            if (l2.next == null && r == 1) {
                l2.next = new ListNode(1);
                r = 0;
            }
            l2 = l2.next;
        } while (p != null && l2 != null);
        if (p == null) {
            t.next = l2;
        }
        return l1;
    }

    @Mark(order = 3, name = "longest-substring-without-repeating-characters", description = "无重复字符的最长子串")
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), maxLength = 0;
        var map = new HashMap<Character, Integer>();
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return maxLength;
    }
}
