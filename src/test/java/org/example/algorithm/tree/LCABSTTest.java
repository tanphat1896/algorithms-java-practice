package org.example.algorithm.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LCABSTTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(TreeNode root, int p, int q, int expected) {
        assertEquals(expected, new LCABST().lowestCommonAncestor(root, new TreeNode(p), new TreeNode(q)).val);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
                Arguments.of(TreeNode.from(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 }), 2, 8, 6),
                Arguments.of(TreeNode.from(new Integer[] { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 }), 2, 4, 2),
                Arguments.of(TreeNode.from(new Integer[] { 2, 1 }), 2, 1, 2),
                Arguments.of(TreeNode.from(new Integer[] { 2, 1, 3 }), 3, 1, 2));
    }
}
