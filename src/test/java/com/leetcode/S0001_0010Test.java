package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class S0001_0010Test {
    private static final S0001_0010 S = new S0001_0010();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, S.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void addTwoNumbers() {
        assertArrayEquals(new int[]{7, 0, 8}, ListNodes.toIntArray(S.addTwoNumbers(
                ListNodes.build(new int[]{2, 4, 3}),
                Objects.requireNonNull(ListNodes.build(new int[]{5, 6, 4})))));
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, S.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, S.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, S.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, S.lengthOfLongestSubstring("aab"));
        assertEquals(3, S.lengthOfLongestSubstring("aabaab!bb"));
    }

    @Test
    void longestPalindrome() {
        assertTrue(Arrays.asList("bab", "aba").contains(S.longestPalindrome("babad")));
        assertEquals("bb", S.longestPalindrome("cbbd"));
    }

    @Test
    void zigzagConversion() {
    }

    @Test
    void reverseInteger() {
        assertEquals(321, S.reverse(123));
        assertEquals(-321, S.reverse(-123));
        assertEquals(21, S.reverse(120));
        assertEquals(0, S.reverse(1534236469));
    }

    @Test
    void isPalindrome() {
        assertTrue(S.isPalindrome(121));
        assertFalse(S.isPalindrome(-121));
        assertFalse(S.isPalindrome(10));
    }
}