package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTreeTest {
    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode root, TreeNode subRoot, boolean isSubTree) {
        assertEquals(isSubTree, new Subtree().isSubtree(root, subRoot));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(TreeNode.from(new int[]{3, 4, 5, 1, 2}), TreeNode.from(new int[]{4, 1, 2}), true),
            Arguments.of(TreeNode.from(new int[]{3, 4, 5, 1, 2, -1, -1, -1, -1, 0}), TreeNode.from(new int[]{4, 1, 2}), false),
            Arguments.of(TreeNode.from(new int[]{1, 1}), TreeNode.from(new int[]{1}), true)
        );
    }
}
