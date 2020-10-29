package com.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer68_1_0 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(8);
        treeNode.left = treeNode1;treeNode.right = treeNode2;
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(4);
        treeNode1.left = treeNode3;treeNode1.right = treeNode4;
        TreeNode treeNode5 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(5);
        treeNode4.left = treeNode5;treeNode4.right = treeNode6;
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(9);
        treeNode2.left = treeNode7;treeNode2.right = treeNode8;
        Offer68_1_0 offer68_1_0 = new Offer68_1_0();
        TreeNode o = offer68_1_0.lowestCommonAncestor(treeNode, new TreeNode(2), new TreeNode(4));
        System.out.println(o.val);

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        List<TreeNode> ap = findFather(root,p);
        findFather(root,p);
        List<TreeNode> ap = new ArrayList<>(result);
        result = new ArrayList<>();
        findFather(root,q);
        List<TreeNode> aq = new ArrayList<>(result);
        TreeNode treeNode = new TreeNode(0);
//        int i;
//        for (TreeNode node : ap) {
//            System.out.print(node.val + " ");
//        }
//        for (TreeNode node : aq) {
//            System.out.print(node.val + " ");
//
//        }
//        System.out.println();
        boolean flag = false;
        for ( int i = ap.size() - 1;i >= 0;i--) {
            for (int j = aq.size() - 1;j >= 0;j--) {
                if (ap.get(i).val == aq.get(j).val) {
//                    return ap.get(i);
                    treeNode = new TreeNode(ap.get(i).val);
                    flag = true;
                    break;
                }

            }
            if (flag) break;
        }
        return treeNode;

    }

    List<TreeNode> result = new ArrayList<>();
    public void findFather (TreeNode root,TreeNode test) {
//        result.add(root);
        if (root.val == test.val) {
            result.add(root);
            return;
        }
        result.add(root);
//        result.add(new )
        if (test.val < root.val) findFather(root.left, test);
        if (test.val > root.val) findFather(root.right, test);
//        findFather(root.left, test);
//        findFa

        /*
        List<TreeNode> result = new ArrayList<>();
        while (root != null) {
            if (test.val < root.val) {
                root = root.left;
                result.add(root);
            }else if (test.val > root.val) {
                root = root.right;
                result.add(root);
            }else {
                result.add(root);
                break;
            }
        }

        return result;

         */
    }
}
