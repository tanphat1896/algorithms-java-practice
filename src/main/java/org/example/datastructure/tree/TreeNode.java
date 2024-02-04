package org.example.datastructure.tree;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(int[] vals) {
        return from(vals, 0);
    }

    private static TreeNode from(int[] vals, int idx) {
        if (idx >= vals.length) {
            return null;
        }
        return new TreeNode(
            vals[idx],
            from(vals, idx * 2 + 1),
            from(vals, idx * 2 + 2)
        );
    }

    @Override
    public String toString() {
        return "TreeNode{" +
            "val=" + val +
            ", left=" + left +
            ", right=" + right +
            '}';
    }

    public static void main(String[] args) {
        System.out.println(TreeNode.from(new int[]{4, 2, 7, 1, 3, 6, 9}));
    }
}
