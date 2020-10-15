package com.company;
/*
    leetcode 已经通过
    基本算 回溯独立作出的第一题
 */
import java.util.ArrayList;
import java.util.List;

public class Leetcode51_0 {
    public static void main(String[] args) {
        Leetcode51_0 leetcode51_0 = new Leetcode51_0();
        List<List<String>> ans = leetcode51_0.solveNQueens(14);
//        System.out.println(ans);
        int sum = 0;
        for (List<String> a:ans
             ) {
            System.out.println(a);
            sum += 1;
        }
        System.out.println(sum);
    }

    List<String> arr = new ArrayList<String>();
    List<List<String>> ans = new ArrayList<List<String>>();

    public List<List<String>> solveNQueens(int n) {
        String a = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a += ".";
            }
            arr.add(a);
            a = "";
        }
//        arr.add(a);
        dfs(n, 0, arr);

        return ans;

    }

    // n为棋盘大小 row 为目前决策的行 strings为当前生成的棋盘已知全为   .
    public void dfs(int n, int row, List<String> strings) {
        if (row == n) {
            ans.add(new ArrayList<String>(strings));
            return;
        }

        for (int col = 0; col < n; col++) {

//            if (isvalid (strings[row].get(col))){

            if (!isvalid(strings, n, row, col)) {
                continue;
            }
//            strings.get(row).charAt(col) = 'Q';
            stringBuilder2String(strings, n, col, true, row);
            dfs(n, row+1, strings);
            stringBuilder2String(strings, n, col, false, row);


        }

//    private boolean isvalid(List<String> strings, int n, int row) {
//        return true;
//    }
//}

    }

    private boolean isvalid(List<String> strings, int n, int row, int col) {
        // 左上角
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (strings.get(i).charAt(j) == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (strings.get(i).charAt(j) == 'Q') return false;

        }
        for (int i = 0;i<n;i++) {
            if (strings.get(i).charAt(col) == 'Q') return false;
            if (strings.get(row).charAt(i) == 'Q') return false;
        }


        return true;
    }

    private void stringBuilder2String(List<String> strings, int n, int col, boolean b, int row) {
        String a = strings.get(row);
        StringBuilder b1 = new StringBuilder(a);
        if (b) {

            b1.setCharAt(col, 'Q');
            strings.set(row, b1.toString());
        } else {
            b1.setCharAt(col, '.');
            strings.set(row, b1.toString());
        }
    }
}



