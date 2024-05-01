package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructBinTreeTest {

    @ParameterizedTest
    @MethodSource("sources")
    public void test(int[] preorder, int[] inorder, TreeNode expected) {
        var root = new ConstructBinTree().buildTree(preorder, inorder);
        assertThat(root).usingRecursiveComparison().isEqualTo(expected);
    }

    private static Stream<Arguments> sources() {
        return Stream.of(
                Arguments.of(new int[] { 3, 9, 20, 15, 7 }, new int[] { 9, 3, 15, 20, 7 },
                        TreeNode.from(new Integer[] { 3, 9, 20, null, null, 15, 7 })),
                Arguments.of(new int[] { 1 }, new int[] { 1 }, TreeNode.from(new int[] { 1 })),
                Arguments.of(new int[] { 1, 2 }, new int[] { 1, 2 }, TreeNode.from(new Integer[] { 1, null, 2 })),
                Arguments.of(new int[] { 1, 2 }, new int[] { 2, 1 }, TreeNode.from(new int[] { 1, 2 })));
    }
}
