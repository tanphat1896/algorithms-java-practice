package org.example.algorithm.tree;


import org.example.datastructure.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinTreeMaxDepthTest {

    @Test
    public void test1() {
        var root = TreeNode.from(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertEquals(3, new BinTreeMaxDepth().maxDepth(root));
    }

    @Test
    public void test2() {
        var root = TreeNode.from(new Integer[]{1, null, 2});
        assertEquals(2, new BinTreeMaxDepth().maxDepth(root));
    }
}
