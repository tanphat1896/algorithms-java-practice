package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void testFastSlow(ListNode head, boolean expected) {
        assertEquals(expected, new LinkedListCycle(true).hasCycle(head));
    }

    @ParameterizedTest
    @MethodSource("sources")
    public void testCheckVisited(ListNode head, boolean expected) {
        assertEquals(expected, new LinkedListCycle(false).hasCycle(head));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(ListNode.makeCycleList(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3), true),
            Arguments.of(ListNode.makeCycleList(new int[]{1, 2}, 0), true),
            Arguments.of(ListNode.from(new int[]{1, 2, 3}), false),
            Arguments.of(ListNode.from(new int[]{1, 2}), false),
            Arguments.of(ListNode.from(new int[]{}), false)
        );
    }
}
