package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode39 {

    public int sum(List<Integer> target){
        int sum1 =0;
        for (Integer in :
               target ) {
           sum1+=in;
        }

        return sum1;
    }
    public List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<Integer> t = new ArrayList<Integer>();

    /*
        List<List<Integer>>
     */

    public void  combination(int[] target,int pos,int targetsum){
        if (sum(t) == targetsum || pos==target.length) {
            ans.add(t);
            return ;
        }
        t.add(target[pos]);
        combination(target,pos+1,targetsum);
        t.remove(t.size()-1);
        combination(target,pos+1,targetsum);

    }

    public List<List<Integer>> dfs(int[] target,int targetsum){
        combination(target,0,targetsum);
        return ans;
    }
    public static void main(String[] args) {

        Leetcode39 leetcode39 = new Leetcode39();
        int[] a = {2,3,5};
        List<List<Integer>> b = leetcode39.dfs(a,8);
        System.out.println(b);


    }
}
