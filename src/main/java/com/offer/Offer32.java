package com.offer;

//import com.company1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        Offer32 offer32 = new Offer32();
        List<List<Integer>> lists = offer32.levelOrder(null);
        System.out.println(lists);

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        while (!queue.isEmpty()) {
//            int a = queue.poll();
//            System.out.println(a);
////            queue.add(3);
////            while (queue.peek() == 2) queue.add(3);
//            if (a == 3) queue.offer(12);
//        }
//        Integer poll = queue.poll();
//        System.out.println(queue);
//        System.out.println(poll);
//        Integer c = 3;
//        a(c);
//        System.out.println(c);

    }

//    public static void a (Integer a ) {
//        a = a + 1;
//    }


    List<Integer> temp ;
    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return result;

        Queue<TreeNode> a = new LinkedList<>();

        Queue<TreeNode> b = new LinkedList<>();

        a.add(root);


        while (!a.isEmpty()) {
//            System.out.println(a);
            temp = new ArrayList<>();
            while (!a.isEmpty()) {
                TreeNode poll = a.poll();
                if (poll.left != null) b.add(poll.left);
                if (poll.right != null) b.add(poll.right);
                temp.add(poll.val);
            }
            result.add(temp);
            a = new LinkedList<>(b);
            b = new LinkedList<>();

        }

//        List<Queue<TreeNode>> a = new ArrayList<>();
        /*

        Queue<Queue<TreeNode>> a = new LinkedList<>();

//        Queue<TreeNode>[] a = new Queue[]

        Queue<TreeNode> b = new LinkedList<>();
        b.add(root);a.add(b);
        while (!a.isEmpty() && !a.peek().isEmpty()) {
//            System.out.println(a);
            Queue<TreeNode> b2 = a.poll();
            temp = new ArrayList<>();
            Queue c = new LinkedList();
            while (!b2.isEmpty()) {
//                Queue c = new LinkedList();
                TreeNode treeNode = b2.poll();
                temp.add(treeNode.val);
//                Queue c = new LinkedList();
//                temp.add();
                if (treeNode.left != null) c.add(treeNode.left);
                if (treeNode.right != null) c.add(treeNode.right);
            }
            a.add(c);
            result.add(temp);
        }

         */

        return result;
//        for (int i = 0;i < )
//        if (root)
//        queue.add(root);
//
//        return result;

//        while (!queue.isEmpty()) {
//            TreeNode poll = queue.poll();
//            temp = new Array
//            if (poll.left != null) queue.offer(poll.left);
//            if (poll.right != null) queue.offer(poll.right);
//        }

    }
}



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
