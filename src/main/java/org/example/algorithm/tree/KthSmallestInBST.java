package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;
public class KthSmallestInBST {

    int count = 0;
    int val = Integer.MAX_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return val;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null || val < Integer.MAX_VALUE) {
            return;
        }

        inorder(node.left, k);

        count++;
        if (count == k) {
            val = node.val;
            return;
        }

        inorder(node.right, k);
    }
}
