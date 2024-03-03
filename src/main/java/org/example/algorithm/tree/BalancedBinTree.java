package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

public class BalancedBinTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int diff = Math.abs(height(root.left) - height(root.right));
        if (diff > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
