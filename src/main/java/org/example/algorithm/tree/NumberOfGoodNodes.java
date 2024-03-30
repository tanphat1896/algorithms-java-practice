package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

public class NumberOfGoodNodes {
    public int goodNodes(TreeNode root) {
        return count(root, root.val);
    }

    private int count(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        int count = root.val >= max ? 1 : 0;

        max = Math.max(max, root.val);
        count += count(root.left, max);
        count += count(root.right, max);

        return count;
    }
}
