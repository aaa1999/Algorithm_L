package com.company;

import java.util.List;

public class Leetcode606 {
    public static void main(String[] args) {
//        /*
//        List<Integer>
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.right = treeNode3;
//        treeNode1.left = treeNode3;

//         */

        /*
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode.left = treeNode1;treeNode.right = treeNode2;
        treeNode2.left = treeNode3;treeNode2.right = treeNode4;

         */

        Leetcode606 leetcode606 = new Leetcode606();
        String s = leetcode606.tree2str2(treeNode);
//        System.out.println(leetcode606.result.substring(1,leetcode606.result.length()-1));
        System.out.println(s);

    }
    public String tree2str2(TreeNode t) {
        if(t==null)
            return "";
        if(t.left==null && t.right==null)
            return t.val+"";
        if(t.right==null)
            return t.val+"("+tree2str2(t.left)+")";
        return t.val+"("+tree2str2(t.left)+")("+tree2str2(t.right)+")";
    }


    public String tree2str(TreeNode t) {
        dfs2(t);
        if (result.equals("")) return "";
        return result.substring(1,result.length()-1);
    }

    String result = "";
    public void dfs2 (TreeNode treeNode) {
        if (treeNode == null) return;
        if (treeNode.left == null && treeNode.right != null) {
            result += "(" + treeNode.val + "()";
            dfs2(treeNode.left);
            dfs2(treeNode.right);
            result += ")";
        }else  {
            result += "(" + treeNode.val;
            dfs2(treeNode.left);
            dfs2(treeNode.right);
            result += ")";
        }
    }

    public void dfs (TreeNode treeNode) {
        if (treeNode == null) return;
            if (treeNode.left != null) {
                result += "(" + treeNode.val;
                dfs(treeNode.left);
                dfs(treeNode.right);
                result += ")";
            }else {
                if (treeNode.left == null || treeNode.right == null) {
                    if (treeNode.left == null && treeNode.right == null) {
                        result += "(" + treeNode.val + "()()";
                        dfs(treeNode.left);
                        dfs(treeNode.right);
                        result += ")";
                    }else {
                        result += "(" + treeNode.val + "()";
                        dfs(treeNode.left);
                        dfs(treeNode.right);
                        result += ")";
                    }
                }
            }
    }
}
