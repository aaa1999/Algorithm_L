package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {

    public static void main(String[] args) {

        Leetcode22 leetcode22 = new Leetcode22();
        List<String> a = leetcode22.generateParenthesis(3);
        System.out.println(a);
    }
    List<String> ans = new ArrayList<>();
    String target = new String("");
    public List<String> generateParenthesis(int n) {

        dfs(n,n,n);
        return ans;
    }
    public void dfs(int left,int right,int n){
        if (left < 0 || right < 0) return;
        if (left > right) {
            return;
        }
        if ((left == 0) && (right == 0)){
            ans.add(target);
            return;

        }
        target += "(";
        dfs (left-1, right, n);
        target = target.substring(0,target.length() - 1);

        target += ")";
        dfs(left, right - 1, n);
        target = target.substring(0,target.length() - 1);
    }

    @Test
    public void test1(){
        String a = "ada";
        a = "dada";
        System.out.println(a);
        String b = a.substring(0,3);
        System.out.println(b);
    }

    @Test
    public void test2(){
        int a = 4;
        int b = 5;
        a^=b;
        b^=a;
        a^=b;
        System.out.println(a);
        System.out.println(b);
    }

}
