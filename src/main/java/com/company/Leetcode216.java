package com.company;

import org.apache.lucene.util.RamUsageEstimator;
import org.junit.jupiter.api.Test;

import java.util.*;

public class Leetcode216 {
    public static void main(String[] args) {
        Leetcode216 leetcode216 = new Leetcode216();
//        List<List<Integer>> lists = leetcode216.combinationSum3(3, 15);
        List<List<Integer>> lists = leetcode216.combinationSum3(3, 15);
        System.out.println(RamUsageEstimator.shallowSizeOf(leetcode216));
        System.out.println(lists);
    }
    List<Integer> target = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
//    Set<Integer> set = new HashSet<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k,n,1);
        return res;
    }

    public void dfs (int k,int n,int pos){
        if (target.size() == k && sum == n) {
//            target.sort();
//            Arrays.sort(target.toArray());
//            Collections.sort(target);
            if (res.contains(target)) return;
            res.add(new ArrayList<>(target));
            return;
        }
        if (target.size() == k && sum !=n){
            return;
        }

        for (int i = pos;i <= 9;i++){
            if (target.contains(i)) continue;
            target.add(i);
            sum += i;
//            System.out.println(target);
            dfs(k,n,i + 1);
            sum -= i;
            target.remove(target.size() - 1);
        }
    }

    @Test
    public void test1(){
        List<Integer> a = new ArrayList<>(Arrays.asList(4,5,2));
//        a.sort();
        System.out.println(a);
        Arrays.sort(a.toArray());
        System.out.println(a);


    }
}
