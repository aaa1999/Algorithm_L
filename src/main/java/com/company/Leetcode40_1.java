package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode40_1 {

    public static void main(String[] args) {
        Leetcode40_1 leetcode40_1 = new Leetcode40_1();
        int[] candidates = {2,5,2,1,2};

        List<List<Integer>> lists = leetcode40_1.combinationSum2(candidates, 5);
        System.out.println(lists);
    }
    List<Integer> target1 = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,0,0);
        return result;
    }

    public void dfs (int[] candidates,int target,int res,int pos){
        if (res == target) {
            result.add(new ArrayList<>(target1));
            return;
        }

        if (res > target) return;
        for (int i = pos;i < candidates.length;i++){
            /*
            if (candidates[i] > target ) continue;
            if (res > target) return;
            if (i > pos && candidates[i] == candidates[i-1]) continue;

             */

            if (candidates[i] > target ) continue;
            if (i > pos && candidates[i] == candidates[i-1]) continue;
            res += candidates[i];
            target1.add(candidates[i]);
            dfs(candidates, target, res, i + 1);
            res -= candidates[i];
            target1.remove(target1.size() - 1);
        }
    }


}
