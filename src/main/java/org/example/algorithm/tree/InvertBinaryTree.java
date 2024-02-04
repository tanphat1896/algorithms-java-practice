package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

import java.util.Stack;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        return invertTreeLoop(root);
    }

    public TreeNode invertTreeRecursive(TreeNode root) {
        if (root == null) {
            return null;
        }

        var tmp = root.left;
        root.left = invertTreeRecursive(root.right);
        root.right = invertTreeRecursive(tmp);

        return root;
    }

    public TreeNode invertTreeLoop(TreeNode root) {
        if (root == null) {
            return null;
        }

        var stack = new Stack<TreeNode>();
        stack.add(root);

        while (!stack.isEmpty()) {
            var node = stack.pop();
            var tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return root;
    }
}
