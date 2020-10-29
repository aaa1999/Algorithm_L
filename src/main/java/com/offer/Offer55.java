package com.offer;

public class Offer55 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        Offer55 offer55 = new Offer55();
        int i = offer55.maxDepth(treeNode1);
        System.out.println(i);


    }

    int height = 0;

    public int max (int a,int b) {
        if (a > b) return a;
        else return b;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return max(maxDepth(root.left),maxDepth(root.right)) + 1;

    }
}
