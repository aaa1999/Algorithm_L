package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Leetcode488 {

    public static void main(String[] args) {
        Leetcode488 leetcode488 = new Leetcode488();
        // board = "WRRBBW", hand = "RB"
        // board = "WWRRBBWW", hand = "WRBRW"
//        String board = "G";
//        String hand = "GGGGG";
        // board = "RBYYBBRRB", hand = "YRBGB"
        String board2 = "RBYYBBRRB";
        String hand2 = "YRBGB";

        String board = "WRRBBW";
        String hand = "RB";
        int minStep = leetcode488.findMinStep(board, hand);
        System.out.println(minStep);

    }
    int count = Integer.MAX_VALUE;
    List<Integer> result = new ArrayList<>();
    int count2 = 0;

    public int findMinStep(String board, String hand) {
        dfs(board, hand);
        if (result.isEmpty())  return -1;

//        System.out.println(result);

        /*
        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

         */
        return count;
    }

    public void dfs (String board,String hand) {
//        HashMap<Character, Integer> frequency = getFrequency(board);
        if (board.equals("")) {
            if (count2 < count) {
//            result.add(count2);
                count = count2;
                count = 0;
            }
            return;
        }else if (hand.equals("") && !board.equals("")) {
            return;
        }else if (correctByString(board)) {
            if (count2 < count) {
                count = 0;
                count = count2;
            }
//            result.add(count2);
        }

        for (int i = 0;i < hand.length();i++) {
            /*
            if ((i == 1 || i == 2) && hand.charAt(i) == 'R') {
//                System.out.println("执行到此");
                System.out.println("执行: " + hand + " " + i);
            }

             */
//            if ()
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
                    if (count2 > count) continue;
                    count2 += 1;
                    String temp = new String(board);
                    board = board.substring(0,pos) + board.substring(j ,temp.length());
                    String temp2 = new String(hand);
                    hand = hand.substring(0,i) + hand.substring(i+1,hand.length());
//                    System.out.println(board + " " + hand);
                    dfs(board, hand);
                    count2 -= 1;
                    hand = new String(temp2);
                    board = new String(temp);
//                    board.s
                }else {
                    if (count2 > count) continue;
                    count2 += 1;
                    String temp = new String(board);
                    if ((j ) == board.length()) {
                        board += hand.charAt(i);
                    }else {
                        board = board.substring(0, j) + hand.charAt(i) + board.substring(j + 1, temp.length());
                    }
                    String temp2 = new String(hand);
                    hand = hand.substring(0,i) + hand.substring(i+1,hand.length());

//                    System.out.println(board + " " + hand);

                    dfs(board, hand);
                    count2 -= 1;
                    hand = new String(temp);
                    board = new String(temp);
                }
            }else {
                continue;
            }

        }
    }

    public String  DetectDeplictChar(String a) {
//        a.substring(0,1);
        int j;
        for (int i = 0;i < a.length() - 3;i++) {
            j = i + 1;
            while (j < a.length()) {
                if (a.charAt(j) != a.charAt(i)) {
                    break;
                }
            }
            if ((j - i) >= 2) {
//                a = a.substring()
            }
        }

        return "aaa";
    }

//    @Test
//    public void test10 () {
//        String a = "aaa";
//        aaaa(a);
//        System.out.println(a);
//    }

    public boolean correctByString (String s) {
        if (s.length() == 0) return true;
        char s2 = s.charAt(0);
        if (s.length() < 3) return false;
        for (int i = 1;i < s.length();i++) {
            if (s.charAt(i) != s2) return false;
        }

        return true;
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

    @Test
    public void test5 () {
        int a = Integer.MAX_VALUE;
        a += 1;
        System.out.println(a);
    }

    @Test

    public void test6 () {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
//        Arrays.sort(a);
        a.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(a.get(0));

    }

    @Test
    public void test7 () {
        boolean aaa = correctByString("aaa");
        boolean aab = correctByString("aab");
        System.out.println(aaa);
        System.out.println(aab);
    }
}
