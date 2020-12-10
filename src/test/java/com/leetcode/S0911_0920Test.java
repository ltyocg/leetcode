package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class S0911_0920Test {
    private static final S0911_0920 S = new S0911_0920();

    @Test
    void sortArray() {
        assertArrayEquals(new int[]{1, 2, 3, 5}, S.sortArray(new int[]{5, 2, 3, 1}));
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 5}, S.sortArray(new int[]{5, 1, 1, 2, 0, 0}));
    }
}
