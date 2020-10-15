package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode89_1 {
//    @Test
    public List<Integer> graycode(int n){
//        List<Integer> res = new ArrayList<Integer>(){{add(0);}};
        List<Integer> res = new ArrayList<Integer>(){{add(0);}};
//        res.add(0);
//        System.out.println(res);
        int head = 1;
        for (int i = 0;i < n;i++){
            for (int j = res.size() - 1;j >= 0;j--)
                res.add(head + res.get(j));
            head <<= 1;
        }

        return res;
    }

    public static void main(String[] args) {
//        List<Integer> res = new ArrayList<Integer>(){{add(0);}};
//        System.out.println(res);
        Leetcode89_1 leetcode89_1 = new Leetcode89_1();
        List<Integer> graycode = leetcode89_1.graycode(2);
        System.out.println(graycode);
//        System.out.println(1 <<= 1);
//        int a = 4;
//        System.out.println(a <<= 1);
    }
}
