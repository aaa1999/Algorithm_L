package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    10/05写
 */
public class Leetcode39_1 {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
//        int[] candidates = {1};
        Leetcode39_1 leetcode39_1 = new Leetcode39_1();
        List<List<Integer>> lists = leetcode39_1.combinationSum(candidates, 7);
        System.out.println(lists);
    }
    List<Integer> a = new ArrayList<>();
    List<List<Integer>> b = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        dfs(candidates,target,0);
//        return ans;
        Arrays.sort(candidates);
        dfs(candidates,target,0,0);
        return b;
    }
    boolean flag = false;
    public void dfs(int[] candidates,int target,int pos,int res){
//        boolean flag = false;
        if (res == target){
            flag = true;
            b.add(new ArrayList<>(a));
            return;
        }
        if (res > target) {
            flag = true;
            return;
        }
        for (int i = pos;i < candidates.length;i++){
            if (target < candidates[i]) continue;
//            res += candidates[i];
            a.add(candidates[i]);
            System.out.println(a);
            dfs(candidates, target, i, res + candidates[i]);
            a.remove(a.size() - 1);
//            res -= candidates[i];
            if (flag) break;
        }
        flag = false;
    }
}
