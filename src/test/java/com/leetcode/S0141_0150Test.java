package com.leetcode;

import com.leetcode.util.ListNodes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S0141_0150Test {
    private static final S0141_0150 Solution = new S0141_0150();

    @Test
    void hasCycle1() {
        Assertions.assertTrue(Solution.hasCycle(ListNodes.build(new int[]{3, 2, 0, -4}, 1)));
    }

    @Test
    void hasCycle2() {
        Assertions.assertTrue(Solution.hasCycle(ListNodes.build(new int[]{1, 2}, 0)));
    }

    @Test
    void hasCycle3() {
        Assertions.assertFalse(Solution.hasCycle(ListNodes.build(new int[]{1}, -1)));
    }

    @Test
    void detectCycle1() {
        final var listNode = ListNodes.build(new int[]{3, 2, 0, -4}, 1);
        Assertions.assertEquals(ListNodes.get(listNode, 1), Solution.detectCycle(listNode));
    }

    @Test
    void detectCycle2() {
        final var listNode = ListNodes.build(new int[]{1, 2}, 0);
        Assertions.assertEquals(ListNodes.get(listNode, 0), Solution.detectCycle(listNode));
    }

    @Test
    void detectCycle3() {
        Assertions.assertNull(Solution.detectCycle(ListNodes.build(new int[]{1}, -1)));
    }
}