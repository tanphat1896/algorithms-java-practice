package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeTwoSortedListTest {


    @ParameterizedTest
    @MethodSource("sources")
    public void testLoop(ListNode l1, ListNode l2, ListNode expected) {
        assertThat(new MergeTwoSortedList(true).mergeTwoLists(l1, l2)).usingRecursiveComparison().isEqualTo(expected);
    }


    @ParameterizedTest
    @MethodSource("sources")
    public void testRecursive(ListNode l1, ListNode l2, ListNode expected) {
        assertThat(new MergeTwoSortedList(false).mergeTwoLists(l1, l2)).usingRecursiveComparison().isEqualTo(expected);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(ListNode.from(new int[]{1, 2, 4}), ListNode.from(new int[]{1, 3, 4}), ListNode.from(new int[]{1, 1, 2, 3, 4, 4})),
            Arguments.of(ListNode.from(new int[]{1, 2, 4, 5, 8}), ListNode.from(new int[]{2, 3, 4}), ListNode.from(new int[]{1, 2, 2, 3, 4, 4, 5, 8})),
            Arguments.of(ListNode.from(new int[]{}), ListNode.from(new int[]{}), ListNode.from(new int[]{})),
            Arguments.of(ListNode.from(new int[]{}), ListNode.from(new int[]{0}), ListNode.from(new int[]{0}))
        );
    }
}
