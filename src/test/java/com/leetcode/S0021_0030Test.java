package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class S0021_0030Test {
    private static final S0021_0030 S = new S0021_0030();

    @Test
    void mergeTwoLists() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNodes.toIntArray(S.mergeTwoLists(ListNodes.build(new int[]{1, 2, 4}), ListNodes.build(new int[]{1, 3, 4}))));
    }

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        assertEquals(2, S.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2}, Arrays.copyOfRange(nums, 0, 2));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, S.removeDuplicates(nums));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOfRange(nums, 0, 5));
    }

    @Test
    void removeElement() {
        int[] nums = new int[]{3, 2, 2, 3};
        assertEquals(2, S.removeElement(nums, 3));
        assertArrayEquals(new int[]{2, 2}, Arrays.copyOfRange(nums, 0, 2));
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        assertEquals(5, S.removeElement(nums, 2));
        assertArrayEquals(new int[]{0, 1, 3, 0, 4}, Arrays.copyOfRange(nums, 0, 5));
    }

    @Test
    void strStr() {
        assertEquals(2, S.strStr("hello", "ll"));
        assertEquals(-1, S.strStr("aaaaa", "bba"));
    }

    @Test
    void divide() {
        assertEquals(3, S.divide(10, 3));
        assertEquals(-2, S.divide(7, -3));
        assertEquals(Integer.MAX_VALUE / 2, S.divide(Integer.MAX_VALUE, 2));
        assertEquals(Integer.MIN_VALUE / 2, S.divide(Integer.MIN_VALUE, 2));
    }
}
