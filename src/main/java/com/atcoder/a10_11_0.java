package com.atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class a10_11_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] que = new int[4];
//        int i = scanner.nextInt();
        for (int i = 0;i < 4;i++){
            que [i] = scanner.nextInt();
        }
        boolean res = correct(que);
        if (res) System.out.println("Yes");
        else System.out.println("No");

//        for (int i:
//                que
//             ) {
//            System.out.println(i);
//        }



    }

    public static boolean correct (int[] que){
        int sum = 0;
        for (int i = 0;i < que.length;i++){
            sum += que[i];
        }
        if (sum % 2 == 0) {

            dfs(que,0,sum / 2);
            if (flag)
            return true;
            else return false;
        }
        else return false;
    }

//    public static List<Integer> que2 = new ArrayList<>();
    public static int sum2 = 0;
    public static boolean flag = false;
    public static void dfs (int[] que,int pos,int halfSum){
        if (sum2 == halfSum || pos == que.length) {
            if (pos == que.length) {
                return;
            }
            flag = true;
            return;
        }
        for (int i = pos;i < que.length;i++){
            sum2 += que[i];
            dfs(que, i + 1, halfSum);
            sum2 -= que[i];
        }
    }
}
