package org.example.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

import org.example.datastructure.tree.TreeNode;

public class ConstructBinTree {

    private Map<Integer, Integer> indexMapper = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int idx = 0; idx < inorder.length; idx++) {
            indexMapper.put(inorder[idx], idx);
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preS, int preE, int inS, int inE) {
        if (preS > preE || inS > inE) {
            return null;
        }

        var node = new TreeNode(preorder[preS]);
        var inI = indexMapper.get(node.val);

        // In inorder, all nodes come before the root are left nodes
        var leftNodeCount = inI - inS;

        // build subtrees
        // inorder:
        // + leftNodes: range [inS, nodeIndex - 1]
        // + rightNodes: range [nodeIndex + 1, inE]

        node.left = buildTree(preorder, inorder, preS + 1, preS + leftNodeCount, inS, inI - 1);
        node.right = buildTree(preorder, inorder, preS + leftNodeCount + 1, preE, inI + 1, inE);

        return node;
    }
}
