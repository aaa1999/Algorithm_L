package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode78_0 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println(ans);
    }



}

class Solution {
    List<Integer> t = new ArrayList<Integer>();

    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return ans;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]);
        dfs(cur + 1, nums);
        t.remove(t.size() - 1);
        dfs(cur + 1, nums);
    }
}

