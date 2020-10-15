package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode47 {
    public static void main(String[] args) {
        Leetcode47 leetcode47 = new Leetcode47();
//        int[] nums = {1,2,3};
        int[] nums = {1,1,2};
         List<List<Integer>> target = leetcode47.permuteUnique(nums);
        System.out.println(target);

    }

    public List<List<Integer>> permuteUnique(int[] nums){
        dfs(nums,0);
        return target;
    }

    private List<Integer> target1 = new ArrayList<Integer>();
    private List<List<Integer>> target = new ArrayList<List<Integer>>();

    public void dfs(int[] nums,int pos){        // pos为已知位置
        if (target1.size() == nums.length){
            target.add(new ArrayList<Integer>(target1));
            return;
        }

        for (int i = 0;i < nums.length;i++){
            if (target1.contains(nums[i]) && i==pos) continue;
            target1.add(nums[i]);
            pos=i;
            dfs(nums,pos);
            target1.remove(target1.size()-1);
//            dfs(nums);  // 加了这一行代码堆栈溢出
        }

        /*
        if (target1.size() == nums.length && !target.contains(target1)){
            target.add(new ArrayList<Integer>(target1));
            return;
        }
        */

        /*

        if (pos == 3){
            target.add(new ArrayList<Integer>(target1));
            return;
        }
        target1.add(nums[pos]);
        dfs(nums, pos+1);
        target1.remove(target1.size()-1);
        dfs(nums, pos+1);


         */



        /*
        target1.add(nums[pos]);
        dfs(nums, pos + 1);
        target1.remove(target1.size()-1);

         */

        /*
        target1.add(nums[pos]);
        dfs(nums, pos + 1);
        target1.remove(target1.size() - 1);
        dfs(nums, pos + 1);

         */

        /*
        for (int i = 0;i < nums.length;i++){
            if ()
            target1.add(nums[i]);
            dfs(nums,0);
            target1.remove(target1.size()-1);
        }

         */

        /*
        for (int i = 0;i < nums.length; i++){


        }

         */
    }
}
