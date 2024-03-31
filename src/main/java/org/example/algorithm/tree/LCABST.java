package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

/**
 * Lowest common ancestor in BST
 */
public class LCABST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        if ((root.val > p.val && root.val < q.val) || (root.val > q.val && root.val < p.val)) {
            return root;
        }

        return lowestCommonAncestor(root.val < p.val ? root.right : root.left, p, q);
    }
}
