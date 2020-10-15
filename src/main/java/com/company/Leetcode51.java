package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Leetcode51 {
    public static void main(String[] args) {
        Leetcode51 leetcode51 = new Leetcode51();
        List<boolean[][]> ans = leetcode51.solveNQueens(4);
        System.out.println(ans);
//        System.out.println("hello world");
    }



    List<String> arr = new ArrayList<String>();
    List<List<String>> ans = new ArrayList<List<String>>();
    List<boolean[][]> ans1 = new ArrayList<boolean[][]>();

//    public List<List<String>> solveNQueens(int n) {

    boolean[][] checkboard;
    public List<boolean[][]> solveNQueens(int n) {
//        boolean[][] checkboard = new boolean[n][n];
        dfs(n,checkboard,0);
        return ans1;
//        return ans;
    }

    public void dfs(int n,boolean[][] checkboard,int row){
        if (row == n) {
            ans1.add(checkboard);
            return;
        }


        // i是列
        for (int i = 0;i < n;i++){
            if (isvalid(checkboard,row,i)) continue;

            checkboard[row][i] = true;
            dfs(n,checkboard,row+1);

            checkboard[row][i] = false;
        }


    }

    private boolean isvalid(boolean[][] checkboard,int row,int col) {
        // 不能放置返回 false
        for (int j=0;j<checkboard.length;j++){
            if (checkboard[row][j]) return false;
            if (checkboard[j][col]) return false;

        }
        // 检查右上角是否有冲突
        for (int i = row - 1,j=col+1;i>=0 && j < checkboard.length;i--,j++){
            if (checkboard[i][j]) return false;

        }

        for (int i = row - 1,j = col - 1;i>=0 && j>=0;i--,j++){
            if (checkboard[i][j]) return false;
        }

        return true;

        // 检查左上角室友有冲突


        // 行比列大 左下角

        /*
        if (row > j) {
            for (int col = 0;col<row-j;col++){
                if (checkboard[row-j+col][col])  return true;

            }
//            for (int row1 = 0;row1 < )
            int col=0,row1=0;
            while (col + row1 == row +j && col>0 && row1>0 && col < checkboard.length && row1 < checkboard.length){

            }
        }
        else if (row < j){

        }else {

        }


         */
    }



//    @Test
    public void test2(){

        boolean[][] checkboard = new boolean[3][3];
//        System.out.println(checkboard);
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 3;j++){
                System.out.println(checkboard[i][j]);
            }
        }
    }



    @Test
    public void test3(){
        /*
        String a = "abcd";
//        a.charAt(0)='a';
        StringBuilder a1 = new StringBuilder(a);
        a1.setCharAt(0,'e');
        System.out.println(a1.toString());

         */

        StringBuilder a1 = new StringBuilder("abcd");
        List<StringBuilder> a2 = new ArrayList<StringBuilder>();
        a2.add(a1);
        System.out.println(a2);
        a2.get(0).setCharAt(0,'e');
        System.out.println(a2);

        String a3 = "abcd";
        List<String> a4 = new ArrayList<String>();
        a4.add(a3);
        System.out.println(a4);

        String a5 = "dadada";
//        a4.add(0,a5);
        a4.set(0,a5);
        System.out.println(a4);
//        System.out.println(a.charAt(0));
        /*
        ArrayList<String> b = new ArrayList<String>();
        b.add(a);
        System.out.println(a.charAt(0));
//        b.get(0).charAt(0)='e';
        System.out.println(b.get(0).charAt(0));
        System.out.println(b.get(0));

         */
    }

//    @Test
    public void test1() {
        List<String> arr1 = new ArrayList<String>();
        List<List<String>> ans1 = new ArrayList<List<String>>();
        for (int i = 0; i < 3; i++) {
            arr1.add("" + i);
            ans1.add(new ArrayList<String>(arr1));

        }
        System.out.println(ans1);


        /*
        String[] ans = new String[3];
        for (int i = 0;i<3;i++){
            ans[i]="" + i;
        }
//        System.out.println
    }


         */
    }

    @Test
    public void test() throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    sb.append("a");
                    sb1.append("a");
                }
            }).start();
        }
        // 睡眠确保所有线程都执行完
        Thread.sleep(1000);

        System.out.println(sb.length());
        System.out.println(sb1.length());
    }
}
