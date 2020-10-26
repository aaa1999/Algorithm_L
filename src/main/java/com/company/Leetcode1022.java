package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1022 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(1);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        Leetcode1022 leetcode1022 = new Leetcode1022();
//        int i = leetcode1022.sumRootToLeaf(treeNode);
//        System.out.println(i);
        leetcode1022.dfs3(treeNode);
        System.out.println(leetcode1022.result);

    }

    int height = 0;
    int Allheight = 0;
//    int sum = 0;

    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    List<TreeNode> result2 = new ArrayList<>();

    /*
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

     */
    public void dfs3 (TreeNode root) {
        if (root != null) {
            temp.add(root.val);
            if (root.left == null && root.right == null) {
                result.add(new ArrayList<>(temp));

            }else {
                dfs3(root.left);
                dfs3(root.right);
            }
        }
        /*
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            result.add(new ArrayList<>(temp));
            return;
        }else {
            temp.add(root.val);
            dfs3(root.left);
            dfs3(root.right);
        }

         */
    }

    public void dfs2 (TreeNode root) {
        if (root == null) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(root.val);
        dfs2(root.left);
//        temp.remove(temp.size() - 1);
        dfs2(root.right);
        temp.remove(temp.size() - 1);


    }

    public void dfs (TreeNode root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            result.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
        }
        temp.add(root.val);
        dfs(root.left);
        dfs(root.right);
        temp.remove(temp.size() - 1);
    }

    public int sumBinary (List<Integer> a) {
        int len = a.size();
        int sum = 0;
        for (int i = 0;i < len;i++) {
            sum += Math.pow(a.get(i),len - 1 - i);
        }
        return sum;
    }

    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        for (List<Integer> a : result) {
            sum += sumBinary(a);
        }
        return sum;

        /*
        if (root == null) {
            return 0;
        }
//        height += 1;
        height -= 1;
        sumRootToLeaf(root.left);
        sumRootToLeaf(root.right);
        System.out.println(root.val + " " + height);
        sum += Math.pow(root.val,height);
        height += 1;
        return sum;

         */
    }


}
