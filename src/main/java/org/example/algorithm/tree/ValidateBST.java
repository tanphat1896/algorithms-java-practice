package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

public class ValidateBST {

    private TreeNode last = null;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode node) {
        if (node == null) return true;

        if (!inorder(node.left)) {
            return false;
        }

        if (last != null && node.val <= last.val) {
            return false;
        }
        last = node;

        return inorder(node.right);
    }
}
