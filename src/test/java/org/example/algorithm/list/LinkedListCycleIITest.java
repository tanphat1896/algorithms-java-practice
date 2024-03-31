package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycleIITest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(ListNode head, Integer expected) {
        var result = new LinkedListCycleII().detectCycle(head);
        assertEquals(expected, result == null ? null : result.val);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(ListNode.makeCycleList(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3), 4),
            Arguments.of(ListNode.makeCycleList(new int[]{1, 2}, 0), 1),
            Arguments.of(ListNode.from(new int[]{1, 2, 3}), null),
            Arguments.of(ListNode.from(new int[]{1}), null),
            Arguments.of(ListNode.from(new int[]{}), null)
        );
    }
}
