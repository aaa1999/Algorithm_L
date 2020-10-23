package com.company;

import lombok.NoArgsConstructor;
import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class Leetcode589 {
    public static void main(String[] args) {

    }
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {

        dfs(root);

        return result;
    }

    public void dfs (Node root) {
        if (root == null) return;
//        val root1 = root;
//        val root1 = root;
        result.add(root.val);
//        dfs(root.children);
        for (Node node :
                root.children) {
            dfs(node);

        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
