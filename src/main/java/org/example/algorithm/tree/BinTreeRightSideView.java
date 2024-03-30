package org.example.algorithm.tree;

import org.example.datastructure.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;


public class BinTreeRightSideView {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(root.val);
        }
        dfs(root.right, level + 1);
        dfs(root.left, level + 1);
    }
}
