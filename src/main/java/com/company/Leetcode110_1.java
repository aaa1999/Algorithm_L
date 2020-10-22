package com.company;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;
//import sun.reflect.generics.tree.Tree;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

public class Leetcode110_1 {

//    public Leetcode110() {
//        treeNodeList = new ArrayList<>();
//    }

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(0);
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode3 = new TreeNode(3);
//        TreeNode treeNode4 = new TreeNode(4);
//        treeNode.left = treeNode1;
//        treeNode.right = treeNode2;
//        treeNode1.left = treeNode3;
//        treeNode3.left = treeNode4;
//
//        System.out.println("hello world");
//        Integer[] a = {1,2,2,3,3,null,null,4,4};
//        Integer[] a = {1,2,3,4,5,6,null,8};
//        Integer[] a = {1,null,2,null,3};
//        TreeNode tree = createTree(a);
//        boolean balanced = isBalanced(tree);
//        System.out.println(balanced);
        Leetcode110_1 leetcode110_1 = new Leetcode110_1();
//        TreeNode tree = leetcode110_1.createTree(a);
        TreeNode tree = new TreeNode(1);
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        tree.left = null;tree.right = treeNode;
        treeNode.left = null; treeNode.right = treeNode1;

        leetcode110_1.dfs2(tree,0);
        System.out.println(leetcode110_1.result);
        /*
        boolean balanced = leetcode110_1.isBalanced(tree);
        System.out.println(balanced);

         */
    }

//    static List<TreeNode> resultList = new ArrayList<>();


    public  boolean isBalanced(TreeNode root) {

//        new TreeNode(1);
//        if (root == null)  return ;
//        if (root == null) r

//        while (root != null) {
//            height = 0;
//
//        }
//        if (root.equals(null)) return true;
//        if (root.val == 1) return true;

        dfs(root);
//        for (TreeNode treeNode : treeNodeList) {
//            System.out.println(treeNode.val);
//        }
//        System.out.println(treeNodeList);
//        System.out.println("hello world");
        for (TreeNode treenode :
                treeNodeList) {
            Lheight = 0;
            Rheight = 0;
//            Rheight = 0;
            leftTreeHeight(treenode.left);
            rightTreeHeight(treenode.left);
            int Lheight2 = (Lheight >= Rheight)?Lheight:Rheight;
//            rightTreeHeight(treenode.right);
            Lheight = 0; Rheight = 0;
            leftTreeHeight(treenode.right);
            rightTreeHeight(treenode.left);
            int Rheight2 = (Lheight >= Rheight)?Lheight:Rheight;
            System.out.println("L: " + Lheight2 + " " + "R: " + Rheight2);
//            System.out.println(Lheight);
//            System.out.println(Rheight);
            if ((Lheight2 - Rheight2) >= 2 || (Rheight2 - Lheight2) >= 2) {
//                System.out.println(treenode.val);
//                System.out.println(Lheight);
//                System.out.println(Rheight);

                return false;
            }

        }
        return true;
    }


    /*
        先序遍历二叉树
     */
     List<TreeNode> treeNodeList = new ArrayList<>();

    public  void dfs(TreeNode root) {
        if (root == null) return;
//        System.out.println(root.val);
        treeNodeList.add(root);
        dfs(root.left);
        dfs(root.right);
    }


    int Lheight = 0;
    int Rheight = 0;

    List<Integer> result = new ArrayList<>();

    public void dfs2 (TreeNode treeNode,int height) {
        if (treeNode == null) {
            result.add(height);
            return;
        }
        height += 1;
        dfs2(treeNode.left,height);
        height -= 1;
        dfs2(treeNode.right, height);
//        dfs2(treeNode, height);

    }

    /*
    public void MaxHeight (TreeNode root) {
        int max = 0;
        leftTreeHeight(root.left);
        rightTreeHeight(root.right);
    }

     */

    /*
    @Test
    public void test3 () {
        TreeNode tree = new TreeNode(1);
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        tree.left = null;tree.right = treeNode;
        treeNode.left = null; treeNode.right = treeNode1;
    }

     */

    public void leftTreeHeight(TreeNode root) {
        if (root == null) return ;
//        Lheight += 1;
        Lheight += 1;
        leftTreeHeight(root.left);
    }

    public void rightTreeHeight (TreeNode root) {
        if (root == null) return;
        Rheight += 1;
        rightTreeHeight(root.right);
    }


    public TreeNode createTree (Integer[] treenode) {

        int len = treenode.length;
        if (len == 0) return null;
//        TreeNode root = new TreeNode();
//        TreeNode[] tree = new TreeNode[(len + 1) /2 - 1];
        TreeNode[] tree = new TreeNode[len];
        for (int i = 0;i < (len + 1)/2 ;i++) {
//            if (2*i+1<)
            tree[i] = new TreeNode(treenode[i]);
            if ((2*i+1)<(len)) {
                if (treenode[2*i+1] != null)
                tree[2*i+1] = new TreeNode(treenode[2*i+1]);
            }
            if ((2*i+2)<len) {
                if (treenode[2*i+2] != null)
                tree[2*i+2] = new TreeNode(treenode[2*i+2]);
            }
//            tree[i].left = tree[2*i+1];
//            tree[i].right = tree[2*i+2];
        }
        for (int i = 0;i < (len+1)/2;i++) {
            if (2*i+1<len)
            tree[i].left = tree[2*i+1];
            if (2*i+2<len)
            tree[i].right = tree[2*i+2];
        }

        return tree[0];
    }



    @Test
    public void test1 () {
        Integer[] a = {1,2,2,3,3,null,null,4,4};
        TreeNode tree = createTree(a);
        dfs(tree);
        for (TreeNode treenode :
                treeNodeList) {
            System.out.println(treenode.val);
        }
//        System.out.println(treeNodeList);
//        TreeNode a = new TreeNode();
//        String a = null;
//        Integer b = null;
//        System.out.println(a.equals(null));
//        System.out.println(a.equals(b));
//        System.out.println(a == b);
//        System.out.println();
    }
}


//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}