package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

public class Subtree {

    private final SameTree sameTree = new SameTree();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return subRoot == null;
        }


        if (root.val == subRoot.val) {
            if (sameTree.isSameTree(root.left, subRoot.left) && sameTree.isSameTree(root.right, subRoot.right)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
