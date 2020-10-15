package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Leetcode216_0 {
    public static void main(String[] args) {
        List<List<Integer>> lists = Leetcode216_0.combinationSum3(3, 9);
        System.out.println(lists);

    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();//存储根节点开始的路径
        dfs3(1, k, path, n, res);
        return res;
    }

    public static void dfs3(int begin, int k, Deque<Integer> path, int target, List<List<Integer>> res) {
        // 1.结束条件
        if (target == 0 && path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }

        // 2.选择列表
        for (int i = begin; i < 10; i++) {
            // 大剪枝
            if (target - i < 0) return;
            // 选择
            path.addLast(i);

            System.out.println(path);
            // 递归
            dfs3(i + 1, k, path, target - i, res);
            // 撤销选择
            path.removeLast();
        }
    }
}
