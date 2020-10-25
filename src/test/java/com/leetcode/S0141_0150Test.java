package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S0141_0150Test {
    private static final S0141_0150 S = new S0141_0150();

    @Test
    void hasCycle() {
        assertTrue(S.hasCycle(ListNodes.build(new int[]{3, 2, 0, -4}, 1)));
        assertTrue(S.hasCycle(ListNodes.build(new int[]{1, 2}, 0)));
        assertFalse(S.hasCycle(ListNodes.build(new int[]{1}, -1)));
    }

    @Test
    void detectCycle() {
        final var listNode1 = ListNodes.build(new int[]{3, 2, 0, -4}, 1);
        assertEquals(ListNodes.get(listNode1, 1), S.detectCycle(listNode1));
        final var listNode2 = ListNodes.build(new int[]{1, 2}, 0);
        assertEquals(ListNodes.get(listNode2, 0), S.detectCycle(listNode2));
        assertNull(S.detectCycle(ListNodes.build(new int[]{1}, -1)));
    }
}