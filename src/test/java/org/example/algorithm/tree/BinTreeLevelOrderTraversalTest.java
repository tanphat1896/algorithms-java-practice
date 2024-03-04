package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinTreeLevelOrderTraversalTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(Integer[] vals, List<List<Integer>> expected) {
        var root = TreeNode.from(vals);
        assertEquals(expected, new BinTreeLevelOrderTraversal().levelOrder(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(new Integer[]{3, 9, 20, null, null, 15, 7}, List.of(List.of(3), List.of(9, 20), List.of(15, 7))),
            Arguments.of(new Integer[]{1}, List.of(List.of(1))),
            Arguments.of(new Integer[]{}, List.of())
        );
    }
}
