package com.company;

import org.apache.lucene.index.SingleTermsEnum;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1022_1 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        Leetcode1022_1 leetcode1022 = new Leetcode1022_1();
//        int i = leetcode1022.sumRootToLeaf(treeNode);
//        System.out.println(i);
//        leetcode1022.dfs3(treeNode);
        List<String> paths = new ArrayList<>();
        String path = "";
        leetcode1022.constructPaths2(treeNode,path,paths);
//        System.out.println(leetcode1022.result);
        System.out.println(paths);

    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }

    public void constructPaths2 (TreeNode root,String path,List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(root.val + "");
            if (root.left == null && root.right == null) {
                paths.add(pathSB.toString());
            }else {
                pathSB.append(" ");
                constructPaths2(root.left, pathSB.toString(), paths);
                constructPaths2(root.right, pathSB.toString(), paths);
            }
        }
    }

}
