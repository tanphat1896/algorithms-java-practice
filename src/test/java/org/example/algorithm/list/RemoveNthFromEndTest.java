package org.example.algorithm.list;


import org.example.datastructure.list.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveNthFromEndTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(ListNode head, int n, ListNode expected) {
        var result = new RemoveNthFromEnd().removeNthFromEnd(head, n);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(ListNode.from(new int[]{1, 2, 3, 4, 5, 6, 7, 8}), 2, ListNode.from(new int[]{1, 2, 3, 4, 5, 6, 8})),
            Arguments.of(ListNode.from(new int[]{1, 2, 3, 4, 5, 6, 7, 8}), 4, ListNode.from(new int[]{1, 2, 3, 4, 6, 7, 8})),
            Arguments.of(ListNode.from(new int[]{1}), 1, ListNode.from(new int[]{})),
            Arguments.of(ListNode.from(new int[]{1, 2}), 1, ListNode.from(new int[]{1})),
            Arguments.of(ListNode.from(new int[]{1, 2}), 2, ListNode.from(new int[]{2}))
        );
    }
}
