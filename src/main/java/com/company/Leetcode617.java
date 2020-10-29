package com.company;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

public class Leetcode617 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
//        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
//        treeNode3.left = treeNode4;
//        treeNode.right = treeNode1;
//        treeNode2.left = treeNode3;
//        treeNode.left = treeNode1
        treeNode.right = treeNode2;
        treeNode3.left = treeNode4;

        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(2);
        treeNode6.left = treeNode7;

        Leetcode617 leetcode617 = new Leetcode617();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode8 = null;
        TreeNode treeNode9 = leetcode617.mergeTrees2(treeNode8, treeNode1);
//        leetcode617.mergeTrees(treeNode,treeNode2);
        System.out.println("hello world");

    }

    public TreeNode mergeTrees3(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees3(t1.left, t2.left);
        merged.right = mergeTrees3(t1.right, t2.right);
        return merged;
    }

    public TreeNode mergeTrees2 (TreeNode t1,TreeNode t2) {
        if (t1 == null) return t2;
        FirstTravel(t1,t2);
        return t1;
//        t1.val += t2.val;
//        return t1;
    }

//    /*

//     */

    public void FirstTravel (TreeNode t1,TreeNode t2) {

        mergeTrees(t1.left,t2.left);
        mergeTrees(t1.right,t2.right);
        if (t1 == null &&  t2 == null) return ;

        if (t1 == null && t2 != null) {
            t1 = t2;
//            return t1;
        }else if (t1 != null && t2 == null) {

        }else if (t1 != null && t2 != null) {

            t1.val += t2.val;
        }

//        if (t1 != null && t2 == null) {
//            return t1;
//        }

//        if (t1 != null && t2 != null) {
//        }
        if (t1.left == null && t2.left != null) {
            t1.left = t2.left;
//            return;
//            return t1;
        }
        if (t1.right == null && t2.right != null){
            t1.right= t2.right;
            return;
//            return t1;
        }
//        if (t1.right == null && t2.right != null){
//            t1.right= t2.right;
//            return t1;
//        }


    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        /*
        if (t1 != null && t2 != null) {
            t1.val += t2.val;
            return null;
        }else if (t1 == null || t2 == null) {

        }

         */

        /*
        if (t1 == null && t2 == null) return null;
        else if (t1 != null && t2 != null) t1.val += t2.val;
        else {
            if (t2 != null) {
                t1 = new TreeNode(t2.val);
            }
            return t1;
        }
//        else
        if (t1.left == null || t2.left == null) {
            if (t1.left == null && t2.left != null) {
                t1.left = t2.left;
                return t1;
            }
//            if (t1.left != null && t2.left == null) t1
        }
        if (t1.right == null || t2.right == null) {
            if (t1.right == null && t2.right != null) {
                t1.right = t2.right;
                return t1;
            }
//            if (t1.left != null && t2.left == null) t1
        }

         */


//        if (t1 == null || t2 == null) {
//            return null;
//        }
        if (t1 == null &&  t2 == null) return null;

        if (t1 == null && t2 != null) {
            t1 = t2;
            return t1;
        }

        if (t1 != null && t2 == null) {
            return t1;
        }

        if (t1 != null && t2 != null) {
            t1.val += t2.val;
        }
        if (t1.left == null && t2.left != null) {
            t1.left = t2.left;
            return t1;
        }
//        if (t1.right == null && t2.right != null){
//            t1.right= t2.right;
//            return t1;
//        }
        if (t1 == null ||  t2 == null) return null;
        mergeTrees(t1.left,t2.left);
        mergeTrees(t1.right,t2.right);

        if (t1.right == null && t2.right != null){
            t1.right= t2.right;
            return t1;
        }
        return t1;
//        if ((t1.left != null || t1.right != null) && (t2.left))
//        if (t1)



        /*
        if (t1 != null && t1 != null) {
            t1.val += t2.val;
            return t1;
        }
        if (t1 == null || t2 == null) {

        }

         */
//        return t1;

    }

    @Test
    public void test1 (TreeNode treeNode) {
//        treeNode = new TreeNode(2);
        treeNode.val = 4;


//        TreeNode treeNode = new TreeNode(3);
//        TreeNode treeNode1 = new TreeNode(4);
//        mergeTrees2(treeNode1,treeNode);
//        System.out.println("hello world");

    }

    @Test
    public void test2 () {
        TreeNode treeNode = new TreeNode(3);
        test1(treeNode);
        System.out.println(treeNode.val);
    }

}
