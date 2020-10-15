package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    这种解法有问题
    回溯法
 */
public class Leetcode89 {
    public static void main(String[] args) {
        Leetcode89 leetcode89 = new Leetcode89();
        List<List<Integer>> lists = leetcode89.grayCode(3);
        System.out.println(lists);
    }
    public String target;
    public List<List<Integer>> ans = new ArrayList<>();
    public List<Integer> target1 = new ArrayList<>();
    public List<List<Integer>> grayCode(int n) {

        dfs(0,n,0);
        return ans;
    }

    public void dfs(int pos,int n,int choice){
        if (pos == n) {
            ans.add(new ArrayList<>(target1));
            return;
        }
//        for (int i = pos;i < n;i++){
//            if (choice == 0) {
//                boolean flag = false;
        if (choice == 0) {
            target1.add(0);
            dfs(pos + 1, n, 0);
            target1.remove(target1.size() - 1);
//                dfs(pos + 1, n, 1);
//            }
//            else {
            target1.add(1);
            dfs(pos + 1, n, 1);
            target1.remove(target1.size() - 1);
        }else {
            target1.add(1);
            dfs(pos + 1, n, 1);
            target1.remove(target1.size() - 1);
            target1.add(0);
            dfs(pos + 1, n, 0);
            target1.remove(target1.size() - 1);
        }
//                dfs(pos + 1, n, 0);
//            }
//        }

        /*
        if (choice == 0) {
            target1.add(choice);
            dfs(pos + 1, n, 0);
            target1.remove(target1.size() - 1);
            dfs(pos + 1, n, 1);
        }
        else {
            target1.add(choice);
            dfs(pos + 1, n, 1);
            target1.remove(target1.size() - 1);
            dfs(pos + 1, n, 0);
        }
         */
    }
    /*
    public static void main(String[] args) {
//        Bag<Double> a = new Bag<Double>();
//        Bag<Double> a = new HashBag
        /*
        Stack<String> a = new Stack<String>();
        a.push("aa");
        a.push("bb");
        String b = a.pop();
        System.out.println(b);

         */

    @Test
    public void test1(){
//        Bag<Double> numbers = new Bag<Double>();
        System.out.println(1 ^ 2);
    }


}
