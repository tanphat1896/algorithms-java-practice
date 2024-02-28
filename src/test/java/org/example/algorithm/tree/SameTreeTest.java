package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameTreeTest {
    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode p, TreeNode q, boolean isSameTree) {
        assertEquals(isSameTree, new SameTree().isSameTree(p, q));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(TreeNode.from(new int[]{1, 2, 3}), TreeNode.from(new int[]{1, 2, 3}), true),
            Arguments.of(TreeNode.from(new int[]{1, 2}), TreeNode.from(new int[]{1, -1, 3}), false),
            Arguments.of(TreeNode.from(new int[]{1, 2, 1}), TreeNode.from(new int[]{1, 1, 2}), false)
        );
    }
}
