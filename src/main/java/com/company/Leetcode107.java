package com.company;

import org.junit.jupiter.api.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Leetcode107 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode.left = treeNode1;treeNode.right = treeNode2;
        treeNode1.left = treeNode3;treeNode2.right = treeNode4;
        Leetcode107 leetcode107 = new Leetcode107();
        List<List<Integer>> lists = leetcode107.levelOrderBottom(null);
        System.out.println(lists);

    }


    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

//    Stack<Stac<TreeNode>> c = new Stack<>();

//    Stack<Stack<TreeNode>> c = new Stack<>();
    Queue<Queue<TreeNode>> result2 = new LinkedList<>();
//    Stack<TreeNode> d ;
    Queue<TreeNode> temp1;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return result;
        temp1 = new LinkedList<>();
        temp1.offer(root);
        result2.offer(temp1);
        while (!result2.isEmpty() && !(result2.peek().isEmpty())) {
            Queue<TreeNode> poll = result2.poll();
            temp = new ArrayList<>();
            temp1 = new LinkedList<>();
            while (!poll.isEmpty()) {
                TreeNode poll2 = poll.poll();
                if (poll2.left != null) temp1.offer(poll2.left);
                if (poll2.right != null) temp1.offer(poll2.right);
                temp.add(poll2.val);
            }
//            System.out.println(temp);
//            System.out.println(temp1);
            result.add(temp);
            result2.offer(temp1);

//            System.out.println(result);
//            System.out.println(result2);
        }
        Collections.reverse(result);
        return result;
    }

    /*
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        d = new LinkedList<>();
        d.add(root);
        c.add(d);
        while (!c.isEmpty() && !(c.peek().isEmpty())) {
            Stack<TreeNode> pop = c.pop();
//            d = new ;
            b = new ArrayList<>();
            while (!pop.isEmpty()) {
//                b.add(pop.pop().val);
                TreeNode pop2 = pop.pop();
                b.add(pop2.val);
                if (pop2.left != null)d.push(pop2.left);
                if (pop2.right != null) d.push(pop2.right);

            }
//            System.out.println();
            c.push(d);
//            System.out.println(d);
//            System.out.println(b);
            Collections.reverse(b);
            a.add(b);
        }

     */
        /*
//        c.push(root);
//        b.add(root.val);
//        a.add(new ArrayList<>(b));
//        while (!c.isEmpty()) {
//            TreeNode pop = c.pop();
//            List<Integer> b1  = new ArrayList<>();
//        }


         */
//        Collections.reverse(a);
//        return a;
//    }


    @Test
    public void test1 () {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        Collections.reverse(a);
        System.out.println(a);
//        int[] c = {1,2,3};
//        Collections.reverse;
    }
}
