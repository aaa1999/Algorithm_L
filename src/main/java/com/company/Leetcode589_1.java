package com.company;

import lombok.val;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode589_1 {
    public static void main(String[] args) {
        val a = "aaa";
        val b = 1;
        System.out.println(a);
        System.out.println(b);

    }

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {

        Stack<Node> temp = new Stack<>();
        temp.add(root);
//        val
        while (!temp.isEmpty()) {
            Node parent = temp.pop();
//            val v = pop;
            if (parent != null) {
                result.add(parent.val);
                List<Node> children = parent.children;
                for (int i = children.size() - 1; i >= 0; i--) {
                    temp.push(children.get(i));
                }
            }
            //            result.add(root.val);

        }

        return result;
    }
}


//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
