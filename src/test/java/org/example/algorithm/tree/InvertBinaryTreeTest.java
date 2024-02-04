package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InvertBinaryTreeTest {

    @Test
    public void test1() {
        var actual = new InvertBinaryTree().invertTree(TreeNode.from(new int[]{4, 2, 7, 1, 3, 6, 9}));
        var expected = TreeNode.from(new int[]{4, 7, 2, 9, 6, 3, 1});
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void test2() {
        var actual = new InvertBinaryTree().invertTree(TreeNode.from(new int[]{2, 1, 3}));
        var expected = TreeNode.from(new int[]{2, 3, 1});
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void test3() {
        var actual = new InvertBinaryTree().invertTree(TreeNode.from(new int[]{}));
        var expected = TreeNode.from(new int[]{});
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}
