package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode77 {
    public static void main(String[] args) {
        Leetcode77 leetcode77 = new Leetcode77();

//        List<List<Integer>> combine = leetcode77.combine(4, 2,0);
        List<List<Integer>> combine = leetcode77.combine(1, 1,0);
        System.out.println(combine);


    }

    List<Integer> target = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k,int pos) {
        dfs(n,k,1);
        return ans;
    }

    public void dfs(int n, int k,int pos) {

        if (target.size() == k) {
            ans.add(new ArrayList<>(target));
            return;
        }
        for (int i = pos;i <= n;i++){
            if (target.contains(i)) continue;
            target.add(i);
            dfs(n,k,i + 1);
            target.remove(target.size() - 1);

        }

    }
}
