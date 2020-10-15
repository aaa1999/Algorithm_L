package com.company;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class Leetcode60 {
    public static void main(String[] args) {
        Leetcode60 leetcode60 = new Leetcode60();
        String permutation = leetcode60.getPermutation(9,331987);
//        String permutation = leetcode60.getPermutation(3,4);
//        String permutation = leetcode60.getPermutation(4,9);
        System.out.println(permutation);
//        permutation
    }

    List<String> ans = new ArrayList<>();
//    List<List<Character>> ans = new ArrayList<>();
    String target = new String();
    int count = 0;
    public String getPermutation(int n, int k) {
        long l = System.currentTimeMillis();
        int n1 = factorial(n);
        int n2 = factorial(n - 1);
        int flag = 0;         // 确定不需要的位置

        if (k % n2 !=0) flag = k / n2 + 1;
        else flag = k / n2;
//        int flag1 = flag;
//        char[] nums = {'1','2','3','4','5','6','7','8','9'};
        char[] nums = new char[n - 1];
        for (int i = 0;i < n - 1 ;i++){
//            nums[i] =
//            if ((i + 1) == flag1) {
//                i--;
//                flag = -1;
//                continue;
//                nums[i] = (char)(i + 2);
//            }
             nums[i] = (char)(i + 1);
        }
        for (int i = 0;i < n - 1;i++){
            if (nums[i] >= flag) nums[i] = (char)((int)(nums[i]) + 1);
        }
//        char[] nums = {'1','2','3','4','5','6','7','8','9'};
        dfs(n,k - (flag - 1) * n2,nums);
        long end = System.currentTimeMillis();
        System.out.println(end - l);
//        System.out.println(ans);
        byte[] haha = ans.get(0).getBytes();
//        return flag + "" + ans.get(0).substring(0,2);
//        return "da";
//        return "dada";
        String return2 = flag +"";
        for (int i = 0;i < haha.length;i++){
            return2 += haha[i];
        }
        return return2;

    }
    public void dfs (int n,int k,char[] nums){

        if (target.length() == nums.length){
//            ans.add(new String(target));
            count ++;
            if (count == k) {
                ans.add(new String(target));
                return;
            }
            return;
        }

        for (int i = 0;i < nums.length;i++){
            if (target.contains(nums[i] + "")) continue;
            target += nums[i];
            dfs(n,k,nums);
            target = target.substring(0,target.length() - 1);
        }

    }

    public int factorial (int n){
        int sum = 1;
        for (int i = 1;i <= n;i++){
            sum *= i;
        }
        return sum;
    }


    @Test
    public void test1() {
        char[] a = {'a','b','c','d'};
        String b = "";
        for (int i = 0;i < a.length;i++){
            b += a[i];
            System.out.println(b);
        }

        /*
        String a = "da";
        System.out.println(a.length());
        char s1 = 'a';
        a += s1;
        System.out.println(a.length());
        a += "";
        System.out.println(a.length());

         */
//        int factorial = factorial(8);
//        System.out.println(factorial);
        /*
        target.add('a');
        target.add('b');
        target.add('c');
        target.add('e');
        ans.add(target);
        System.out.println(target);

         */

        /*
        System.out.println(ans);
        String a = "";
        a += "da";
        List<String> b = new ArrayList<>();
//        b.add(new ArrayList<>(a));
        b.add(new String(a));
        a +="dd";
        b.add(new String(a));
        System.out.println(b);

    }

         */
//        String a = "dafaf";
//        String substring = a.substring(0, a.length());
//        System.out.println(substring);
    }

}