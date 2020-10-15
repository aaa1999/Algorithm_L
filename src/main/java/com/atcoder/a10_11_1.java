package com.atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class a10_11_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        while (true) {
//            int i = scanner.nextInt();
//
//        }

        int lines = scanner.nextInt();
        scanner.nextLine();

        int[] que = new int[lines];
        for (int i = 0;i < lines;i++){
            que[i] = scanner.nextInt();
        }

        long l = System.currentTimeMillis();
        int result = res(que);
        long l2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(l2 - l);
    }

    public static int res (int[] que) {
        Arrays.sort(que);

        int min = que[0];

//        for (int i = 1;i < que.length;i++){
//            if (que[i] < min) min = que[i];
//        }

        boolean flag = true;
//        int result = 1;
//        int j = 0;
        int i = min;
        for (i = min;i > 0;i--){
//            if (que[i] % i != 0)  {
//                flag = false;
//                continue;
//            }
            flag = true;
            for (int j = 0;j < que.length;j++){
                if (que[j] % i != 0) {
                    flag = false;
//                    continue;
                    break;
                }
            }
            if (flag) {
//                result = i;
                break;
            }
//            if (flag) return i;
        }
        return i;
    }
}
