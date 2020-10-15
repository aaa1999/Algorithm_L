package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_47_1 {
    public static void main(String[] args) {
        Leetcode_47_1 leetcode_47_1 = new Leetcode_47_1();
        int[] nums = {1,1,2};
//        int[] nums = {1,2,3};
        List<List<Integer>> lists = leetcode_47_1.permuteUnique(nums);
        System.out.println(lists);
    }
    List<Integer> ans = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
//        boolean[] visited = new boolean[nums.length];
        visited = new boolean[nums.length];
//        for (int i = 0;i < nums.length;)
        Arrays.sort(nums);
        dfs(nums);
        return res;
    }
    boolean[] visited ;
//    List<Boolean> visited = new ArrayList<>();
    public void dfs (int[] nums){
        if (ans.size() == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0;i < nums.length;i++){
            if (i > 0 && !visited[i - 1] && nums[i] == nums[i - 1]) continue;
            if (ans.contains(nums[i]) && visited[i]) continue;
            ans.add(nums[i]);
            visited[i] = true;
            dfs(nums);
            ans.remove(ans.size() - 1);
            visited[i] = false;
        }
    }
}
