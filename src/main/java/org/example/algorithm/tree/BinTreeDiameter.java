package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

/**
 * 1. We calculate the max depth of left and right child, the diameter (D) is the sum of them
 * 2. Since the diameter does not require to pass through root, so repeat the process on the left and right child.
 * 3. On each calculation depth of a node, do extra action: calculate diameter and update new maxD value
 */
public class BinTreeDiameter {
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxD;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int dl = depth(root.left);
        int dr = depth(root.right);

        int diameter = dl + dr;
        maxD = Math.max(maxD, diameter);

        return 1 + Math.max(dr, dl);
    }
}
