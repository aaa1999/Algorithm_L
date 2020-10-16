package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


/*
    by wenchang
    on 2020/10/15
    using backtracking algorithm
 */
public class Leetcode357 {
    public static void main(String[] args) {
        Leetcode357 leetcode357 = new Leetcode357();
        int i = leetcode357.countNumbersWithUniqueDigits(8);
        System.out.println(i);

    }



    public int countNumbersWithUniqueDigits(int n) {
        dfs(n);

        return count + 1;
    }

    int count = 0;
//    StringBuffer a = new StringBuffer();
    List<Integer> a = new ArrayList<>();

    public void dfs (int n){

        if (a.size() == n) {
            return;
        }

        for (int i = 0;i <= 9;i++) {
            if (a.contains(i) || (a.isEmpty() && i == 0)) continue;
            a.add(i);
//            System.out.println(a);
            count += 1;
            dfs(n);

            a.remove(a.size() - 1);
        }

    }


    @Test
    public void test1(){

        StringBuffer a = new StringBuffer();
        a.append(1);
        a.append(2);
        a.append("34");
        a.deleteCharAt(3);
        System.out.println(a);
    }

}
