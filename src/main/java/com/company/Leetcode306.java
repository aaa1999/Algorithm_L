package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/*
    By wenchang
    On 2020/10/16
    using backtracking Algorithm
 */
public class Leetcode306 {
    public static void main(String[] args) {
        Leetcode306 leetcode306 = new Leetcode306();
        boolean additiveNumber = leetcode306.isAdditiveNumber("19910011992");
        System.out.println(additiveNumber);

    }
    public boolean isAdditiveNumber(String num) {

        boolean result = false;
        if (num.length() < 3) return result;
        result = dfs(num,0);
        return result;
    }

    boolean flag = false;
    List<Long> target = new ArrayList<>();

    public boolean dfs (String nums,int pos) {
        if (target.size() > 2) {
        if (!(target.get(target.size() -1 ) == target.get(target.size() -2 ) + target.get(target.size() - 3))) {
            return false;
        }
//            return false;
    }
        if (pos == nums.length()) {
            if (target.size() < 3) return false;
            return true;
        }

        for (int i = 1;i <= 13;i++) {
            if ((pos + i) > nums.length()) break;
            String s = nums.substring(pos,pos + i);
            if (s.charAt(0) == '0' && i > 1) break;

            Long numS = Long.parseLong(s);

            target.add(numS);
            if (dfs(nums, pos + i))  return true;
//            else return true;
            target.remove(target.size() - 1);


        }

        return false;

    }

    public int length (String s) {
//        int s2 = Integer.parseInt(s);


//        if (s.length() )
        return 0;
    }

    @Test
    public void test(){
        String s = "9910011992";
//        System.out.println(Integer.parseInt(s));
        long a = Long.parseLong(s);
        System.out.println(a);
        int b = 3;
        System.out.println(a + b);
        List<Long> c = new ArrayList<>();
        c.add(a);
        c.add((long)b);
    }
}
