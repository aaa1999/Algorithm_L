package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode93 {
    public static void main(String[] args) {
        Leetcode93 leetcode93 = new Leetcode93();
//        leetcode93.dfs("25525511135",0);
        List<String> strings = leetcode93.restoreIpAddresses("25525511135");
//        System.out.println(leetcode93.ans2);
        System.out.println(strings);

    }
    List<String> ans = new ArrayList<>();
    List<List<String>> ans2 = new ArrayList<>();
    String target = new String();

    public List<String> restoreIpAddresses(String s) {
        dfs(s,0);
        target = "";
        for (int i = 0;i < ans2.size();i++){
            for (int j = 0;j < 4;j++){
                target += ans2.get(i).get(j) + ".";
            }
            ans.add(new String(target.substring(0,target.length() - 1)));
            target = "";
        }

//        System.out.println(ans2);
//        /*

        /*
        for (int i = 0;i < ans2.size();i++){
            for (int j = 0;j < 4;i++){
//                target +=
                target += ans2.get(i).get(j) + ".";

            }
            ans.add(new String(target.substring(0,target.length() - 1)));
            target = "";
        }


//         */
        return ans;
    }

    public void dfs (String s,int pos){
        if (ans.size() == 4){
            if (pos == s.length()) {
                ans2.add(new ArrayList<>(ans));
                return;
            }
            return;
        }

        for (int i = 1;i <= 3;i++){
            if ((pos + i) > s.length()) return;
            String temp = s.substring(pos,pos + i);
            int temp2 = Integer.parseInt(temp);

            if (temp2 >= 0 && temp2 <= 255){
                if (temp.startsWith("0")){
                    if (i == 1) {
                        ans.add(temp);
                        dfs(s,pos + i);
                        ans.remove(ans.size() - 1);
                    }else {
                        continue;
                    }
                }else {
                    ans.add(temp);
                    dfs(s,pos + i);
                    ans.remove(ans.size() - 1);
                }

            }else continue;


//            if (i == 2 || i == 3) {
//
//            }
        }
    }


    @Test
    public void test1(){
//        String a = "123";
//        int a2 = Integer.parseInt(a.substring(0,3));
//        System.out.println(a2);
//        System.out.println(a.startsWith("1"));
        List<String> a = new ArrayList<>();
        a.add("a1"); a.add("a2"); a.add("a3");
        List<List<String>> b = new ArrayList<>();
        b.add(new ArrayList<>(a));
        a.remove(0);a.remove(0);a.remove(0);
        a.add("b1");a.add("b2");a.add("b3");
        b.add(new ArrayList<>(a));
        System.out.println(b);
//        System.out.println(b.size());

        for (int i = 0;i < b.size();i++){
//            for (int j = 0;j < b.get(i).size();j++){
//                System.out.println(b.get(i).get(j));
//            }
            System.out.println(b.get(i));
        }

    }
}
