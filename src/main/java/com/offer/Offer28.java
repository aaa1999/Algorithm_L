package com.offer;

//import lombok.val;

import org.junit.jupiter.api.Test;

public class Offer28 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(4);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;
        Offer28 offer28 = new Offer28();
        boolean symmetric = offer28.isSymmetric(null);
//        offer28.reverseTree(treeNode);
//        System.out.println(treeNode);
        System.out.println(symmetric);
    }

    public void reverseTree (TreeNode root) {
        // root.left ,root.right = root.right,root.left;
        if (root == null) {
            return;
        }
        TreeNode lefttemp = root.left;
        root.left = root.right;
        root.right = lefttemp;
        reverseTree(root.left);
        reverseTree(root.right);
//        reverseTree(root.left);
//        reverseTree(root.right);
    }

    public boolean equals (TreeNode left,TreeNode right) {
//        if (left == null || right == null) {
//            return left == right;
//        }
        // 当都走到叶子节点的时候
//        if ((left.left == null && left.right == null) && right.left == null && right.right == null) {
////            System.out.println(left.val + " " + right.val);
//            return left.val == right.val;
//        }
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

//        System.out.println(left.left + " " + right.left);
        if (left.val == right.val) return equals(left.left,right.left) && equals(left.right,right.right);
//        return left.val == right.val;
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        reverseTree(root.right);
        boolean equals = equals(root.left, root.right);
        return equals;

//        if (root.left == null || root.right == null) {
//
//        }
//        return root.left.val == root.right.val;
//        if (root.left == null && root.right == null) {
//            return true;
//        }

//        if (root.left ==)

//        val symmetric = isSymmetric(root.left);
//        val symmetric = isSymmetric(root.left);
//        return isSymmetric(root.left)== isSymmetric(root.right.val);
//        return isSymmetric()
//        return
    }

    @Test
    public void test1 () {
        TreeNode treeNode = null;
        System.out.println("hello world");
    }
}
