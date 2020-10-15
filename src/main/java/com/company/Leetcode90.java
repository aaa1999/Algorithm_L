package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode90 {
    public static void main(String[] args) {
        Leetcode90 leetcode90 = new Leetcode90();
//        int[] nums = {2,2,1};
        int[] nums = {1,2,3};
        List<List<Integer>> lists = leetcode90.subsetsWithDup(nums);
        System.out.println(lists);
    }
    public List<Integer> target = new ArrayList<>();
    public List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
//        boolean[] visit = new boolean[nums.length];
        Arrays.sort(nums);
        dfs(nums,0);
        return ans;
    }
//    boolean flag;
    public void dfs (int[] nums,int pos){

//        if (pos > 0) {
        ans.add(new ArrayList<>(target));
//            return;
//        }

        for (int i = pos;i < nums.length;i++){
            if (i > pos && nums[i] == nums[i - 1]) continue;
//            if (visit[i]) continue;
//            flag = true;
            if (ans.contains(nums[i])) continue;
            target.add(nums[i]);
//            visit[pos] = true;
            dfs(nums, i + 1);
            target.remove(target.size() - 1);
//            visit[pos] = false;

        }
    }
}
