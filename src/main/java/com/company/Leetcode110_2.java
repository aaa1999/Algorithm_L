package com.company;


/*
    我目前二叉树的方向还只知道怎么遍历，，

    这里我发现二叉树的构造通过数组的方式来构造我都不会
 */
public class Leetcode110_2 {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        tree.left = null;tree.right = treeNode;
        treeNode.left = null; treeNode.right = treeNode1;

//        boolean balanced = isBalanced(tree);
//        System.out.println(balanced);
        int height = height(tree);
        System.out.println(height);
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

}
