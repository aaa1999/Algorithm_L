package com.company;

public class Leetcode37_0 {
    public static void main(String[] args) {
        int[] a = {1,2};
        Leetcode37_0 leetcode37_0 = new Leetcode37_0();
        leetcode37_0.change(a);
        System.out.println(a[0]);
    }
    public void change(int[] a){
        a[0] = 10;
    }
}
