package org.example.algorithm.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class NumberOfGoodNodesTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode root, int expected) {
        assertEquals(expected, new NumberOfGoodNodes().goodNodes(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(TreeNode.from(new Integer[]{3, 1, 4, 3, null, 1, 5}), 4),
            Arguments.of(TreeNode.from(new Integer[]{3, 3, null, 4, 2}), 3),
            Arguments.of(TreeNode.from(new Integer[]{1}), 1)
        );
    }
}
