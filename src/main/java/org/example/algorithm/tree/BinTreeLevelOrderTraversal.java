package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinTreeLevelOrderTraversal {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return result;
        }

        levelOrder(root, 0);
        return result;
    }

    public void levelOrder(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);
        levelOrder(node.left, level + 1);
        levelOrder(node.right, level + 1);
    }
}
