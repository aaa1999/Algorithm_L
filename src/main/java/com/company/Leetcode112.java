package com.company;

public class Leetcode112 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        Leetcode112 leetcode112 = new Leetcode112();
        boolean b = leetcode112.hasPathSum(treeNode, 5);
        System.out.println(b);
    }

    public boolean hasPathSum (TreeNode root,int sum) {
        hasPathSum2(root,sum);
        return flag;
    }

    public boolean flag = false;

    public void  hasPathSum2(TreeNode root, int sum) {
//        else return false;

        if (root == null) return ;
        hasPathSum(root.left,sum - root.val);
        if (root.left == null && root.right == null && (sum - root.val) == 0) flag = true;
        hasPathSum(root.right, sum - root.val);

//        return true;
//        flag = true;
    }
}
