package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

class S0001_0010Test {
    private static final S0001_0010 Solution = new S0001_0010();

    @Test
    void twoSum() {
        Assertions.assertArrayEquals(new int[]{0, 1}, Solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void addTwoNumbers() {
        Assertions.assertArrayEquals(new int[]{7, 0, 8}, ListNodes.toIntArray(Solution.addTwoNumbers(
                ListNodes.build(new int[]{2, 4, 3}),
                Objects.requireNonNull(ListNodes.build(new int[]{5, 6, 4})))));
    }

    @Test
    void lengthOfLongestSubstring1() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        Assertions.assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring3() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstring4() {
        Assertions.assertEquals(2, Solution.lengthOfLongestSubstring("aab"));
    }

    @Test
    void lengthOfLongestSubstring5() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("aabaab!bb"));
    }
}