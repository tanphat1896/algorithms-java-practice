package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

public class BinTreeMaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
