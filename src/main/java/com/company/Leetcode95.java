package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode95 {
    public static void main(String[] args) {

    }

    List<TreeNode> result = new ArrayList<>();
    List<TreeNode> temp = new ArrayList<>();

//    List<List<TreeNode>>  result = new ArrayList<>();

    public List<TreeNode> generateTrees(int n) {
//        if (n == 1)  temp.add(new TreeNode(n));
//        result.add(new ArrayList<>(temp));
        temp.add(new TreeNode(n));
        if (n == 1) return temp;
        for (int i = 2;i <= n;i++){
            for (TreeNode treeNode:
                temp ) {
                
            }
        }

        return temp;
    }
}


