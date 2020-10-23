package com.offer;

import lombok.val;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Offer54 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(2);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.right = treeNode3;
        Offer54 offer54 = new Offer54();
        int i = offer54.kthLargest(treeNode, 1);
        System.out.println(i);

    }
    public int kthLargest(TreeNode root, int k) {
        FirstTravel(root);
        int result2 = result.get(result.size() - k);


        return result2;
    }

    List<Integer> result = new ArrayList<>();
    public void  FirstTravel (TreeNode root) {
        if (root == null) return ;
        FirstTravel(root.left);
        result.add(root.val);
        FirstTravel(root.right);
    }
}
