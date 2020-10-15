package com.company;

//import com.company1.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode94 {
//    private int age;
//    public Leetcode94(int age){
//        this.age = age;
//    }
public static void main(String[] args) {
    Leetcode94 leetcode94 = new Leetcode94();
    TreeNode treeNode = new TreeNode(1);
    TreeNode treeNode2 = new TreeNode(2);
    TreeNode treeNode3= new TreeNode(3);
    treeNode.left = treeNode2;
    treeNode.right = treeNode3;
    treeNode2.left = treeNode2.right = null;
    treeNode3.left = treeNode3.right = null;
    List<Integer> integers = leetcode94.inorderTraversal(treeNode);
    System.out.println(integers);
}
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
//        root.val
//        1,null,2,3
        dfs(root);
        return res;

    }
    public void dfs (TreeNode root){
        if (root == null) return;
                //        if (root.le)
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }