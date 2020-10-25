package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S0011_0020Test {
    private static final S0011_0020 S = new S0011_0020();

    @Test
    void romanToInt() {
        assertEquals(3, S.romanToInt("III"));
        assertEquals(4, S.romanToInt("IV"));
        assertEquals(9, S.romanToInt("IX"));
        assertEquals(58, S.romanToInt("LVIII"));
        assertEquals(1994, S.romanToInt("MCMXCIV"));
    }

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", S.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", S.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("", S.longestCommonPrefix(new String[0]));
    }

    @Test
    void removeNthFromEnd() {
        assertArrayEquals(new int[]{1, 2, 3, 5}, ListNodes.toIntArray(S.removeNthFromEnd(ListNodes.build(new int[]{1, 2, 3, 4, 5}), 2)));
        assertArrayEquals(new int[0], ListNodes.toIntArray(S.removeNthFromEnd(ListNodes.build(new int[]{1}), 1)));
    }

    @Test
    void isValid() {
        assertTrue(S.isValid("()"));
        assertTrue(S.isValid("()[]{}"));
        assertFalse(S.isValid("(]"));
        assertFalse(S.isValid("([)]"));
        assertTrue(S.isValid("{[]}"));
    }
}
