package com.company;

import java.util.LinkedList;
import java.util.List;

public class Leetcode46_0 {

    public static void main(String[] args) {
        int[] a = {1,2,3};

        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Leetcode46_0 leetcode46_0 = new Leetcode46_0();
         res = leetcode46_0.purte(a);
        System.out.println(res);
    }

    List<List<Integer>> res = new LinkedList<List<Integer>>();

    List<List<Integer>> purte(int [] nums){
        LinkedList<Integer> track = new LinkedList<Integer>();

        backtrack(nums,track);
        return res;
    }

    void backtrack(int[] nums,LinkedList<Integer> track){
        if (track.size()==nums.length) {
//            res.add(track);
            res.add(new LinkedList(track));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (track.contains(nums[i])) continue;
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast(); // track.remove(track.size()-1);
        }
    }
}
