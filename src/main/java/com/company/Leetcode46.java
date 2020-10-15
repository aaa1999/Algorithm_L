package com.company;

/*
    排列问题
    这一个是我的，其余两个都是  微信公众号上的参考模板答案
 */

//import java.awt.*;
//import java.lang.reflect.Array;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    public static void main(String[] args) {
        Leetcode46 leetcode46 = new Leetcode46();
        int[] a = {1,2,3};
        List<List<Integer>> permute = leetcode46.permute(a);
        System.out.println(permute);
    }

    public List<List<Integer>> target = new ArrayList<List<Integer>>();
    public List<Integer> target1 = new ArrayList<Integer>();

//    public java.util.List<java.util.List<Integer>> ans = new ArrayList<java.util.List<Integer>>();
//    public java.util.List<Integer> t = new ArrayList<Integer>();

//    public
    public List<List<Integer>> permute(int[] nums){
        dfs(nums);
        return target;
    }

    public void dfs (int[] nums){
        if (target1.size()==nums.length){
//            target.add(target1);
//            target.add(new ArrayList<target1>);
            System.out.println(target1 );
//            target.add(new ArrayList<Integer>(target1));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (target1.contains(nums[i])) continue;
            target1.add(nums[i]);
            dfs(nums);
//            target1.remove(target1.size()-1);
            target1.remove(target1.size()-1);
//            dfs(nums);
        }
    }

    @Test
    public void test1(){
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);a.add(2);a.add(3);
        System.out.println(a);
        a.remove(a.size()-1);
        System.out.println(a);
    }

    @Test
    public void test2(){
        for (int i=0;i<3;i++){
            target1.add(i);
//            target.add(target1  );
            target.add(new ArrayList<Integer>(target1));
            System.out.println(target1.hashCode());

        }
        System.out.println(target);
    }
}
