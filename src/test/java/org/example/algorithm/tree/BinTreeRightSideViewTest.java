package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinTreeRightSideViewTest {
    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode root, List<Integer> expected) {
        assertEquals(expected, new BinTreeRightSideView().rightSideView(root));
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
            Arguments.of(TreeNode.from(new Integer[]{1, 2, 3, null, 5, null, 4}), List.of(1, 3, 4)),
            Arguments.of(TreeNode.from(new Integer[]{1, null, 3}), List.of(1, 3)),
            Arguments.of(TreeNode.from(new Integer[]{}), List.of()),
            Arguments.of(TreeNode.from(new Integer[]{1, 2, 3, null, 5}), List.of(1, 3, 5)),
            Arguments.of(TreeNode.from(new Integer[]{3, 1, 4, 3}), List.of(3, 4, 3))
        );
    }
}
