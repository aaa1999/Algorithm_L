package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Leetcode78 {
    public  List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public  ArrayList<Integer> t = new ArrayList<Integer>();

    public List<List<Integer>>  dfs(int[] nums) {
        subsets(0,nums);

        return ans;
    }

    public static void main(String[] args) {
        Leetcode78 leetcode78 = new Leetcode78();
        int[] testNums = {1,2};
         List<List<Integer>> ans1 = leetcode78.dfs(testNums);
         int count = 0;
        System.out.println(ans1);
        for (List<Integer>c:ans1
        ) {
            count+=1;
            System.out.println(c);
        }
        System.out.println(count);
    }

    @Test
    public void test1(){
        ArrayList<List<Integer>> integers = new ArrayList<List<Integer>>();
        ArrayList<Integer> integers1 = new ArrayList<Integer>();
        Integer[] a = {1,2,3};
        List<Integer> integers2 = Arrays.asList(a);
        integers.add(integers2);
        Integer[] b = {1,2};
        List<Integer> integers3 = Arrays.asList(b);
        integers.add(integers3);
//        System.out.println(integers);
        for (List<Integer>c:integers
             ) {
            System.out.println(c);
        }
    }


    public void  subsets(int cur,int[] nums){
        /*
        if (cur == nums.length){
            ans.add(new ArrayList<Integer>(t));
            return ;
        }
        t.add(nums[cur]);
        subsets(cur+1,nums);
        t.remove(t.size()-1);
        subsets(cur+1,nums);

        List<List<Integer>>
         */

        if (cur == nums.length){
            ans.add(new ArrayList<Integer>(t));
            return ;
        }
        t.add(nums[cur]);
        subsets(cur+1,nums);
        t.remove(t.size()-1);
        subsets(cur+1,nums);

    }
}
