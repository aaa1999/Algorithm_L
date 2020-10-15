package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
//import java.util.

public class Leetcode89_0 {
    public static void main(String[] args) {
//        Leetcode89_0 leetcode89_0 = new Leetcode89_0();
//        List<List<Integer>> lists = leetcode89_0.grayCode(1);
//        System.out.println(lists);
        Leetcode89_0 leetcode89_0 = new Leetcode89_0();
        List<Integer> a = leetcode89_0.grayCode2(3);
//        System.out.println(leetcode89_0.ans);
        System.out.println(a);

    }
//    private void
//    public List<Integer> target = new ArrayList<>();
//    public List<Integer> target1 = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> grayCode(int n) {
//        List<List<int[]>> ans = new ArrayList<>();
//        List<Integer> target = new ArrayList<>();
//        target.add(0);
        List<Integer> a1 = new ArrayList<>();
        a1.add(0);
//        a1.add(1);
        ans.add(a1);
//        for (int i = 0 ; i < n ;i++){
//
//        }
        dfs(n,0,ans);

        return ans;
    }



    public List<Integer> grayCode2(int n) {

        if (n >= 2){
            dfs2(1);
        }
        dfs2(n);
        List<Integer> a = new ArrayList<>();
        int sum = 0;
        for (int i = 0;i < ans.size();i++){
            for (int j = 0;j < n;j++){
//                sum += ans.get(i).get(j)
                sum +=ans.get(i).get(n - j -1) * Math.pow(2,j);
            }
            a.add(sum);
            sum = 0;
        }
//        System.out.println(a);
//        return ans;
        return a;
    }
    public void dfs2(int n){
//        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            result.add(n);
            ans.add(new ArrayList<>(result));
        }else if (n == 1){
            result.add(0);
            ans.add(new ArrayList<>(result));
            result.remove(0);
            result.add(1);
            ans.add(new ArrayList<>(result));
        }else {
            for (int i = 0;i < n - 1;i++){
                generate (ans);
            }
        }

    }

    private void generate(List<List<Integer>> ans) {
        List<Integer> result = new ArrayList<>();
            List<List<Integer>> ans1 = new ArrayList<>(); // 拷贝ans 维持一份副本
            for (int k = 0;k < ans.size();k++){
                ans1.add(new ArrayList<>(ans.get(k)));
            }
            for (int j = 0;j < ans1.size();j++){
                    result = new ArrayList<>(ans1.get(j));
                    result.add(0);
                    for (int j2 = result.size() - 2;j2 >= 0;j2--){
                        result.set(j2+1,result.get(j2));

                    }
                    result.set(0,0);
                    ans.set(j,result);
            }
            for (int j = 0;j < ans1.size();j++){
                result = new ArrayList<>(ans1.get(ans1.size() - 1 -j));
                result.add(0);
                for (int j2 = result.size() - 2;j2 >= 0 ;j2 --){
                    result.set(j2+1,result.get(j2));

                }
                result.set(0,1);
//                ans.set(j,result);
                ans.add(result);
            }
            /*
            for (int j = 0;j < i;j++){

            }

             */

    }

    public void dfs(int n,int pos,List<List<Integer>> ans){
        if (pos == n){
            return;
        }
        List<List<Integer>> ans1 = new ArrayList<>();
        List<Integer> target = new ArrayList<>();
        List<Integer> target1 = new ArrayList<>();
        // 可以考虑放到下面那个
        for (int i = 0;i < ans.size();i++){
            ans1.add(ans.get(i));
        }
        for (int i = 0;i < ans1.size();i++){
            target.add(0);
            target1.add(1);
            for (int j = 0;j < ans1.get(i).size();j++){
                target.add(ans1.get(i).get(j));
                target1.add(ans1.get(ans1.size() - i - 1).get(j));
//                ans.set(i,new ArrayList<>(target));
//                target.removeAll();
//                target.add(ans1.get(i).get(j));
//                target.
            }
            ans.set(i,new ArrayList<>(target));
//            ans.set(i,new ArrayList<>(target1));
            ans.add(target1);

//            target.add()

        }
        /*
        for (List<Integer> ans1 : ans){

        }

         */
        dfs(n,pos + 1,ans);

    }

    @Test
    public void test1(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(a.get(0));
        b.set(0,2);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test2(){
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        System.out.println(a);
//        a.set(0,-1);
//        System.out.println(a);

        for (int i = 0;i < a.size();i++){
            a.set(i+1,a.get(i));
        }
        a.set(0,-1);
        System.out.println(a);
    }
}
