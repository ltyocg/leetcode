package com.leetcode;

import com.leetcode.lang.Mark;
import com.leetcode.lang.Solution;
import com.leetcode.util.ListNode;

import java.util.Stack;

@Solution
public class S0011_0020 {
    @Mark(order = 13, name = "roman-to-integer", description = "罗马数字转整数")
    public int romanToInt(String s) {
        s += ' ';
        var result = 0;
        for (var i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    i++;
                    if (s.charAt(i) == 'V') result += 4;
                    else if (s.charAt(i) == 'X') result += 9;
                    else {
                        result += 1;
                        i--;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    i++;
                    if (s.charAt(i) == 'L') result += 40;
                    else if (s.charAt(i) == 'C') result += 90;
                    else {
                        result += 10;
                        i--;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    i++;
                    if (s.charAt(i) == 'D') result += 400;
                    else if (s.charAt(i) == 'M') result += 900;
                    else {
                        result += 100;
                        i--;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }

    @Mark(order = 14, name = "longest-common-prefix", description = "最长公共前缀")
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        var i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            char c = 0;
            for (String str : strs) {
                char cc;
                try {
                    cc = str.charAt(i);
                } catch (IndexOutOfBoundsException e) {
                    return stringBuilder.toString();
                }
                if (c == 0) c = cc;
                else if (cc != c) return stringBuilder.toString();
            }
            stringBuilder.append(c);
            i++;
        }
    }

    @Mark(order = 19, name = "remove-nth-node-from-end-of-list", description = "删除链表的倒数第N个节点")
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var fast = head;
        for (var i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        var slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    @Mark(order = 20, name = "valid-parentheses", description = "有效的括号")
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (stack.empty()) return false;
            else switch (c) {
                    case ')':
                        if (stack.pop() + c != '(' + ')') return false;
                        break;
                    case ']':
                        if (stack.pop() + c != '[' + ']') return false;
                        break;
                    case '}':
                        if (stack.pop() + c != '{' + '}') return false;
                        break;
                }
        }
        return stack.empty();
    }
}
