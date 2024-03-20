package org.example.algorithm.tree;

import org.example.datastructure.tree.BST;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestInBSTTest {

    @Test
    public void test1() {
        var bst = BST.from(new int[]{1, 6, 5, 4, 2, 9,});
        assertEquals(4, new KthSmallestInBST().kthSmallest(bst.getRoot(), 3));
    }
}
