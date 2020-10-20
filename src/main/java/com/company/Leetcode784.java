package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode784 {
    public static void main(String[] args) {
        Leetcode784 leetcode784 = new Leetcode784();
//        List<String> a1b2 = leetcode784.letterCasePermutation("a1b2");
        List<String> a1b2 = leetcode784.letterCasePermutation("0");
        System.out.println(a1b2);

    }

    List<String> result = new ArrayList<>();
    String temp = "";

    public List<String> letterCasePermutation(String S) {
        dfs(S,0);



        return result;

    }

    public void dfs (String s,int pos) {
        if (pos == s.length()) {
            result.add(new String(temp));
            return;
        }
        int[] a = {0,32};
        if (s.charAt(pos) >= 'A' && s.charAt(pos) <= 'z') {
            if (s.charAt(pos) >= 'A' && s.charAt(pos) <= 'Z') {
                for (int i = 0; i < a.length; i++) {
                    temp += (char)(s.charAt(pos) + a[i]);
                    dfs(s,pos + 1);
                    temp = temp.substring(0,temp.length() - 1);
                }
            }else {
                for (int i = 0; i < a.length; i++) {
                    temp += (char)(s.charAt(pos) - a[i]);
                    dfs(s,pos + 1);
                    temp = temp.substring(0,temp.length() - 1);
                }
            }


        }else {
            temp += s.charAt(pos);
            dfs(s,pos + 1);
            temp = temp.substring(0,temp.length() - 1);
        }
//        if (s.substring(pos,pos + 1))
        /*
        if (s.charAt(pos) >= 'a' && s.charAt(pos) <= 'z') {
            temp += (char) (s.charAt(pos) - 32);
            dfs(s,pos+1);
            temp = temp.substring(0,temp.length() - 1);
        }else if (s.charAt(pos) >= 'A' && s.charAt(pos) <= 'Z') {
            temp += (char) (s.charAt(pos) + 32);
            dfs(s,pos+1);
            temp = temp.substring(0,temp.length() - 1);
        }else {
            temp += s.charAt(pos);
            dfs(s,pos+1);
            temp = temp.substring(0,temp.length() - 1);
        }

         */
    }

//    public boolean correct

    @Test
    public void test1 () {
//        String a = "abcd";
//        String s = a + 'e';

//        char a = 'a';
//        String s = a.substring(0,1).toUpperCase();
//        String a1 = a
        char s = (char)('A' + 32);
        System.out.println(s);
    }
}
