package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode897 {

    TreeNode treeNode ;
    public TreeNode increasingBST(TreeNode root) {
        middleTravel(root);
//        while (root != null)
        for (int i = 0;i < result.size() - 1;i++) {
            result.get(i).right = result.get(i+1);
        }

        return result.get(0);

    }
    List<TreeNode> result = new ArrayList<>();

    public void  middleTravel (TreeNode root) {
        if (root == null) return;
        middleTravel(root.left);
        treeNode = new TreeNode(root.val);
        result.add(treeNode);
        middleTravel(root.right);
    }
}

//class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }
