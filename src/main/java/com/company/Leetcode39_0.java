package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode39_0 {

    public static void main(String[] args) {
        Leetcode39_0 leetcode39_0 = new Leetcode39_0();
        int[] a1 = {2,3,5};

        List<List<Integer>> ans1 = leetcode39_0.combination(a1,8);
        System.out.println(ans1);

    }


    public List<List<Integer>> combination(int[] a , int b){
        dfs(a,b,0);
        return ans;

    }

    public List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<Integer> t = new ArrayList<Integer>();

    public void dfs(int[] a ,int b,int pos){
        if (pos == a.length){
            return;
        }
        if (b == 0){
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        dfs(a,b,pos+1);
        if (b - a[pos] >= 0){
            t.add(a[pos]);
            dfs(a,b-a[pos],pos);
            t.remove(t.size()-1);
//            dfs(a,b-a[pos],pos+1);

        }
    }

}
