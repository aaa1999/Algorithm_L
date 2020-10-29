package com.company;

public class Leetcode226 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.left = treeNode1;
        treeNode.right = null;
        Leetcode226 leetcode226 = new Leetcode226();
        TreeNode treeNode3 = leetcode226.invertTree(treeNode);
        System.out.println("hello world");


    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        if (root.left == null && root.right == null) {
            return root;
        }
//        if (root)
        TreeNode treeNode = root.right;
        root.right = root.left;
        root.left = treeNode;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
