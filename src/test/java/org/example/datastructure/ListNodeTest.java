package org.example.datastructure;

import org.example.datastructure.list.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListNodeTest {

    @Test
    public void test() {
        var node = ListNode.from(new int[]{1, 2, 3, 4});
        var expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        assertThat(node).usingRecursiveComparison().isEqualTo(expected);
    }
}
