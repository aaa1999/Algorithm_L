package com.company1;

//import sun.reflect.generics.tree.Tree;

public class TreeNode {
//    private Tree
    private int x;
    private TreeNode left;
    private  TreeNode right;

    public TreeNode(int x){
        this.x = x;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{}" + this.x;
    }
}
