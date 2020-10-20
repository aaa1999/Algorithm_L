package com.company;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class Leetcode488 {

    public static void main(String[] args) {

    }
    int count = Integer.MAX_VALUE;

    public int findMinStep(String board, String hand) {




        return 0;
    }

    public void dfs (String board,String hand) {
//        HashMap<Character, Integer> frequency = getFrequency(board);
        for (int i = 0;i < hand.length();i++) {
            if (board.contains(hand.charAt(i) +"")) {
                int pos = findTheChar(board,hand.charAt(i));
//                if (){
//                }
                int j = 0;
                for (j = pos;j < board.length();j++) {
                    if (board.charAt(j) != hand.charAt(i)) {
//                        continue;
                        break;
                    }
                }
                if ((j - pos + 1) >= 3 ) {
                    String temp = new String(board);
                    board = board.substring(0,pos) + board.substring(j + 1,temp.length());
                    String temp2 = new String(hand);
                    hand = hand.substring(0,i) + hand.substring(i+1,hand.length());
                    dfs(board, hand);
                    hand = new String(temp2);
                    board = new String(temp);
//                    board.s
                }
            }

        }
    }


    /*
        这个方法好像也有问题
     */
    public void removeUsedString (String original,String a) {
        if (original.contains(a)) {
//            original.re
            original.replace(a,"");
        }
    }
    // colored red(R), yellow(Y), blue(B), green(G), and white(W).

    /*
        这个方法有问题
        不能使用
     */

    public HashMap<Character,Integer> getFrequency (String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0;i < s.length();i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                int count = hashMap.get(s.charAt(i)).intValue() + 1;
                hashMap.put(s.charAt(i),count);

            }else hashMap.put(s.charAt(i),1);
        }
        return hashMap;
    }

    public int findTheChar (String result,char a) {
        int i = -1;
        for (i = 0;i < result.length();i++) {
            if (result.charAt(i) == a) break;
        }
        return i;
    }

    public boolean findThree (String result) {
        boolean flag = true;
        char char2 = result.charAt(0);
        for (int i = 1;i < result.length();i++) {
            if (result.charAt(i) != char2) {
//                char2 = r
                flag = false;
            }
        }

        return flag;
    }

    @Test
    public void test3() {
        String a = "index";
        System.out.println(a.codePointAt(1));
    }

    @Test
    public void test1 () {
//        boolean a = false;
//        System.out.println(a);
//        String a = "abbccdd";
//        System.out.println(a.contains("bc"));
//        a.
//    }`kkkkkkkkkkkkkkkkkkkk
        String a = "abcb";
        String a2 = a.replace("b","");
        System.out.println(a2);
    }

    @Test
    public void test2 () {
        HashMap<Character, Integer> aabbcd = getFrequency("aabbcd");
        for (Map.Entry<Character,Integer> a:aabbcd.entrySet()){
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }

    @Test
    public void test4 () {
//        String a = "aaabbc";
//        a.replace('a',' ');
//        a.replace('b',' ');
//        removeUsedString(a,"aaa");
//        a.replace("c","");
//        System.out.println(a);
        String a = "abcd";
        String b = a/**/;
        b += "e";
        System.out.println(a);
        System.out.println(b);
    }
}
