package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode377 {
    public static void main(String[] args) {
        Leetcode377 leetcode377 = new Leetcode377();
        int[] nums = {1,2,3};
//        int[] nums = {4,2,1};
        int target = 4;
        int i = leetcode377.combinationSum42(nums, target);
        System.out.println();
        System.out.println(i);

    }
    public int combinationSum42(int[] nums, int target) {
        int[] dp = new int[target + 1];
        // 这个值被其它状态参考，设置为 1 是合理的
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
//                    System.out.print();
                }
            }
            System.out.print(dp[i] + "\t");
        }
        return dp[target];
    }

    public int combinationSum4(int[] nums, int target) {
        long start = System.currentTimeMillis();
        dfs(nums, target);
        long end = System.currentTimeMillis();
        System.out.println("执行用时: " + (end - start));
        System.out.println(ans);
        return ans.size();

    }

    int count;
    int sum = 0;
    List<Integer> target1 = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public void dfs (int[] nums,int target){
        if (sum == target) {
            ans.add(new ArrayList<>(target1));
            return;
        }else if (sum > target) return;
        for (int i = 0;i < nums.length;i++){
            target1.add(nums[i]);
            sum += nums[i];
            dfs(nums, target);
            sum -= nums[i];
            target1.remove(target1.size() - 1);
        }


    }
}
