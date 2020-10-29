package com.company;

public class Leetcode226_1 {
    public static void main(String[] args) {
        Leetcode226_1 leetcode226_1 = new Leetcode226_1();

    }
    /*
        先对左右子树进行翻转
        最后分别对划分好的进行翻转
        注意递归截止条件，和返回条件
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

}
