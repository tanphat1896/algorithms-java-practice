package org.example.algorithm.list;

import org.example.datastructure.list.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {

    @Test
    public void test() {
        var head = ListNode.from(new int[]{1, 2, 3, 4, 5});
        var expected = ListNode.from(new int[]{5, 4, 3, 2, 1});
        assertThat(new ReverseLinkedList().reverseList(head)).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void testRecursive() {
        var head = ListNode.from(new int[]{1, 2, 3, 4, 5});
        var expected = ListNode.from(new int[]{5, 4, 3, 2, 1});
        assertThat(new ReverseLinkedList().reverseListUsingRecursive(head)).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void testRecursive2() {
        var head = ListNode.from(new int[]{1, 2, 3, 4, 5});
        var expected = ListNode.from(new int[]{5, 4, 3, 2, 1});
        assertThat(new ReverseLinkedList().reverseListUsingRecursive2(head)).usingRecursiveComparison().isEqualTo(expected);
    }
}
