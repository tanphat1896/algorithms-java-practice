package org.example.datastructure.tree;

import java.util.ArrayList;
import java.util.List;

public class BST {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }

        insert(root, val);
    }

    private void insert(TreeNode node, int val) {
        if (node.val == val) {
            throw new IllegalArgumentException("Duplicated value " + val);
        }

        if (node.val < val) {
            rightInsert(node, val);
        } else {
            leftInsert(node, val);
        }
    }

    private void leftInsert(TreeNode node, int val) {
        if (node.left == null) {
            node.left = new TreeNode(val);
            return;
        }

        insert(node.left, val);
    }

    private void rightInsert(TreeNode node, int val) {

        if (node.right == null) {
            node.right = new TreeNode(val);
            return;
        }
        insert(node.right, val);
    }

    public List<Integer> inorder() {
        var ret = new ArrayList<Integer>();
        inorder(ret, root);
        return ret;
    }

    private void inorder(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(result, node.left);
        result.add(node.val);
        inorder(result, node.right);
    }

    public static BST from(int[] nums) {
        var bst = new BST();
        for (int num : nums) {
            bst.insert(num);
        }
        return bst;
    }
}
