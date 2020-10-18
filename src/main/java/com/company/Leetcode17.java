package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
    public static void main(String[] args) {
        Leetcode17 leetcode17 = new Leetcode17();
        String digits = "";
        leetcode17.letterCombinations(digits);
        System.out.println(leetcode17.result);
        System.out.println(leetcode17.result.isEmpty());

    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return result;

        dfs(digits,0);
        return result;
    }

    List<String> digits2Num = new ArrayList<>();
    List<String> result = new ArrayList<>();
    String temp = new String();

    public void dfs(String digits,int pos) {
        if (pos == digits.length()) {
            result.add(new String(temp));
            return;
        }

//        char temp2 = getTheCharByNum (digits.charAt(pos));
        char[] theCharByNum = getTheCharByNum(digits.charAt(pos));

        for (char char2Num :
                theCharByNum) {
            if (char2Num == '\0') continue;
            temp += char2Num;
            dfs(digits, pos + 1);
            temp = temp.substring(0,temp.length() - 1);
        }
//        for (int i = 0;i)


    }

    // 97 - 122
    private char[] getTheCharByNum(char o) {
        char[] result = new char[4];
        if (o >= '2' && o <= '6') {
//            result[0] =
            for (int i = 0;i < 3;i++) {
                char temp3 = (char)(o + 47 + i + (o - '2') * 2);
                result[i] = temp3;
//                result[i] = o + 65 + i;
            }
//            return
        }else {
            if (o == '8') {
                for (int i = 0;i < 3;i++) {
                    char temp3 = (char) (60 + i + o);
                    result[i] = temp3;
                }
            }else {
                if (o == '7') {
                    for (int i = 0;i < 4;i++) {
                        char temp3 = (char) (57 + i + o);
                        result[i] = temp3;
                    }
                }else{
                    for (int i = 0;i < 4;i++) {
                        char temp3 = (char) (62 + i + o);
                        result[i] = temp3;
                    }
                }

            }
        }

        return result;
    }

    @Test
    public void test1() {
//        char a = '0' + 47;
//        System.out.println(a);
//        String a = "abcd";
//        System.out.println(a.substring(0,a.length() - 1));
//        char[] b = new char[3];
//        System.out.println((int)(b[0]));
//        System.out.println(b[0] == '\0');
        char[] theCharByNum = getTheCharByNum('3');
        for (char a :
                theCharByNum) {
            System.out.println(a);
        }
    }
}
