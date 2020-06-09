package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class S0001_0010Test {
    private static final S0001_0010 Solution = new S0001_0010();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void addTwoNumbers() {
        assertArrayEquals(new int[]{7, 0, 8}, ListNodes.toIntArray(Solution.addTwoNumbers(
                ListNodes.build(new int[]{2, 4, 3}),
                Objects.requireNonNull(ListNodes.build(new int[]{5, 6, 4})))));
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, Solution.lengthOfLongestSubstring("aab"));
        assertEquals(3, Solution.lengthOfLongestSubstring("aabaab!bb"));
    }

    @Test
    void longestPalindrome() {
        assertTrue(Arrays.asList("bab", "aba").contains(Solution.longestPalindrome("babad")));
        assertEquals("bb", Solution.longestPalindrome("cbbd"));
    }

    @Test
    void reverseInteger() {
        assertEquals(321, Solution.reverse(123));
        assertEquals(-321, Solution.reverse(-123));
        assertEquals(21, Solution.reverse(120));
        assertEquals(0, Solution.reverse(1534236469));
    }
}