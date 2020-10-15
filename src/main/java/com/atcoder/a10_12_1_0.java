package com.atcoder;
import org.junit.jupiter.api.Test;

import java.util.*;
//public class a10_12_1_0 {
//
//}



public class a10_12_1_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gcd = sc.nextInt();
        long l = System.currentTimeMillis();
        for (int i = 1; i < n; i++) {
            gcd = getGCD(gcd, sc.nextInt());
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        System.out.println(gcd);
    }

    static int getGCD(int x, int y) {
        System.out.println(x + " " + y);
        if (x % y == 0) {
            return y;
        } else {
            return getGCD(y, x % y);
        }
    }

    @Test
    public void test1(){
        int gcd = getGCD(4, 6);
        System.out.println(gcd);
    }
}
