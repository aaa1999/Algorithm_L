package com.company;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Leetcode488_1 {
    public static void main(String[] args) {

    }

    public int findMinStep(String board, String hand) {

        return 0;
    }

    public void dfs (String board,String hand) {
        HashMap<Boolean, Integer> threeOrMoreChar = findThreeOrMoreChar(board);
//        threeOrMoreChar
        if (threeOrMoreChar.size() != 1) {
            board = board.substring(0,threeOrMoreChar.get(Boolean.TRUE)) + board.substring(threeOrMoreChar.get(Boolean.FALSE.FALSE),board.length());


        }

        for (int i = 0;i < hand.length();i++) {


        }

        /*
        while (!hand.isEmpty()) {
            int DoubleCharPos = findDoubleChar(board);
            if (DoubleCharPos != -1 ) {
                char DoubleChar = board.charAt(DoubleCharPos);
                if (hand.contains(DoubleChar + "")) {

                }
            }
        }

         */
    }

//    public HashMap<Character,Integer>

    /*
        未考虑空串以及字符串长度小于3的情况
     */
    public int findDoubleChar (String a,int count) {
        int result = -1;
        int count2 = 0;
        for (int i = 0;i < a.length();i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
//                i += 1;
                if (count2 == count) result = i + 1;
                count2 ++;
                i++;
//                result = i + 1;
//                break;
            }
        }
        return result;
    }

    public int findTheChar (String a,char b) {
        int result = 0;
        for (int i = 0;i < a.length();i++) {
            if (a.charAt(i) == b) {
//                return/**/
                result = i;
                break;

            }
        }
        return result;
    }

    public HashMap<Boolean,Integer> findThreeOrMoreChar (String a) {
        HashMap<Boolean,Integer> result = new HashMap<>();
        int j = 0;
        int i = 0;
        for (i = 0;i < a.length();i++) {
//            int j = i+1;
            j = i + 1;
            while (j < a.length()) {
                if (a.charAt(j) != a.charAt(i)) break;
                j++;
            }
            break;
//            if ((j - i) >= 2) return true;
//            else return false;
        }

        if ((j - i) >= 2) {

            result .put(Boolean.TRUE,i);
            result.put(Boolean.FALSE,j);
        }
//        return false;
        else result.put(Boolean.FALSE,-1);

        return result;
    }

    @Test
    public void test1 () {
        HashMap<Boolean,Integer> a = new HashMap<>();
        a.put(Boolean.TRUE,1);
        a.put(Boolean.TRUE,2);
        System.out.println(a.size());
    }

}
