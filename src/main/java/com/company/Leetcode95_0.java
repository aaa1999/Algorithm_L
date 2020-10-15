package com.company;

import lombok.Data;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leetcode95_0 {
    public static void main(String[] args) {
        Leetcode95_0 leetcode95_0 = new Leetcode95_0();
        List<TreeNode> treeNodes = leetcode95_0.generateTrees(2);

//        System.out.println(treeNodes);
        for (TreeNode treenode :
                treeNodes) {
//            System.out.println(treenode.val);
            leetcode95_0.travelMid(treenode);
            System.out.println();
        }
    }

    public void travelMid (TreeNode treeNode){
        if (null == treeNode) return;
        travelMid(treeNode.left);
        System.out.print(treeNode.val + " ");
        travelMid(treeNode.right);
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return generateTrees(1, n);
    }

//    List<TreeNode> allTrees = new LinkedList<TreeNode>();
    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        // 枚举可行根节点
        for (int i = start; i <= end; i++) {
            // 获得所有可行的左子树集合
            List<TreeNode> leftTrees = generateTrees(start, i - 1);

            // 获得所有可行的右子树集合


            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            // 从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currTree = new TreeNode(i);
                    currTree.left = left;
                    currTree.right = right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }

    int count = 0;
    @Test
    public void test1(){
        if (count == 3) return;
        List<String> a = new ArrayList<>(Arrays.asList("a","b","c"));
//        a.add(a.get(a.size() - 1));
        System.out.println(a +  " " + count);
        count += 1;
        test1();
//        a.add(null);
//        a.add(null);
//        a.add(null);
        System.out.println(a);
//        Leetcode95_0 leetcode95_0 = new Leetcode95_0();
    }

    @Test
    public void test2(){
        TreeNode treeNode = new TreeNode();
        System.out.println(treeNode.val);

        int a = 1;
        System.out.println(a);
    }

    @Test
    public void test3(){
        A a = new A();
        System.out.println(a.getA1());
        System.out.println(a.getA2());
    }

}


@Data
class A {
    private int a1;
    private Integer a2;

    public A() {
    }

    public A(int a1, Integer a2) {
        this.a1 = a1;
        this.a2 = a2;
    }


}
