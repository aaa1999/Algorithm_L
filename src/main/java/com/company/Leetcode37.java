package com.company;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    1-9之间为字符
    '.'代表空格，还没有填写
 */

public class Leetcode37 {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
//        System.out.println(board);
        Leetcode37 leetcode37 = new Leetcode37();
        for (int i = 0;i < board.length;i++){
            for (int j = 0;j < board.length;j++){
                System.out.print(board[i][j] + " ");
//                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        leetcode37.solveSudoku(board);
        for (int i = 0;i < board.length;i++){
            for (int j = 0;j < board.length;j++){
                System.out.print(board[i][j] + " ");
//                System.out.println();
            }
            System.out.println();
        }
    }

    public void solveSudoku(char[][] board) {
        dfs(board,0,0);
//        backtrack(board,0,0);

    }

    public boolean backtrack (char[][] board,int r,int c) {
        if (c == 9) return backtrack(board, r + 1, 0);
        if (r == 9) return true;
        for (int i = r; i < 9; i++) {
            for (int j = c; j < 9; j++) {
                if (board[i][j] != '.') return backtrack(board, r, c + 1);
                for (char k = '1';k<='9';k++) {
                    if (!isvalid2(board, i, j,k)) continue;
                    board[i][j] = k;
                    if (backtrack(board, i, j + 1)) return true;
                    board[i][j] = '.';
                }
                return false;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,int row,int col) {
        if (col == 9) {
            return dfs(board, row + 1, 0);
        }
        if (row == 9) return true;
        for (int i = row; i < 9; i++) {
            for (int j = col; j < 9; j++) {
                if (board[i][j] != '.') return dfs(board, row, col + 1);
                for (int k = 1; k <= 9; k++) {
//                    board[i][j] = (char) (k + 48);
//                    if (!isvalid2(board, i, j, (char)(k + 48))) continue;
                    if (!isvalid(board,i,j,k)) continue;
//                dfs(board, i, j + 1);
                    board[i][j] = (char)(k + 48);
                    if (dfs(board, i, j + 1)) return true;
                    board[i][j] = '.';

                }
                return false;
            }
        }
        return false;
    }
        /*
        if (row == board.length && col == board.length){
            return;
        }
        if (board[row][col] == '.') {
        for (int i = 0;i < board.length;i++) {
            board[row][col] = (char) (i + 48);
            if (!isvalid(board, row, col)) continue;
            dfs(board, row, col + 1);
            dfs(board, row + 1, 0);
            board[row][col] = '.';
        }
        }
        /*
        for (int i = 0;i < board.length;i++){
            for (int j = 0;j < board.length;j++){
                if (board[i][j] !='.') continue;
                for (int k = 0;k < board.length;k++){
                    board[i][j] = (char)(k+48);
                    if (!isvalid(board, i,j)) continue;
                }
                dfs(board, i,j);
            }
            dfs(board, i,j);
        }


         */

        /*
        for (int i = 0;i < board.length;i++){
            for (int j = 0;j < board.length;j++){
                if (board[i][j] != '.') continue;

            }
        }

         */
        /*
        for (int col = 0;col<board.length;col++){
            if ( board[row][col] != '.' || !isvalid(board,row,col)){
                continue;
            }



            for (int i = 0;i<board.length;i++){
                board[row][col] = (char)(48+i);
                dfs(board, row + 1);
                board[row][col] = '.';
            }


         */
    private boolean isvalid2(char[][] board,int r,int c,char n){
        for (int i = 0;i < 9;i++){
            if (board[r][i] == n) return false;
            if (board[i][c] == n) return false;
            if (board[(r/3)*3 + i / 3][(c/3)*3 + i%3 ] == n) return false;
        }
        return true;
    }


    private boolean isvalid(char[][] board,int row,int col,int k) {

//        board[row][col] = (char)(48+k);
        char flag = (char)(48 + k);
        for (int i = 0;i<board.length;i++){
//            if (board[row][i])
//            if ((board[row][i] == board[row][col] && i != col) || (board[i][col] == board[row][col] && i != row)) return false;
            if (board[row][i] == flag || board[i][col] == flag) return false;
        }
        int row1 = row/3;
        int col1 = col/3;

        /*
        for (int i = 0;i < 3;i++){
            for (int j = row1*3 + i)
        }
         */
        for (int i = row1*3;i < row1*3 + 3;i++){
            for (int j = col1*3; j < col1*3 + 3;j++){
//                if (board[i][j] == board[row][col] && (i!=row && j!=col) ) return false;
                if (board[i][j] == flag) return false;
            }
        }

        return true;
    }

    private boolean belongToDigital(char a){
        char[] b = {'1','2','3','4','5','6','7','8','9'};
        List<Character> c = new ArrayList<Character>(Arrays.asList());
        if (c.contains(a)) return true;
        else return false;
    }


    public void change(int[] a){
        a[0]=1;
        a[1]=2;
    }



    @Test
    public void test1(){
//        char a = 'a';
//        System.out.println(a);
//        System.out.println((a == 'a'));
        int[] a = {0,2,3};
        change(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        char[][] b = {{'a','b'},{'c','d'}};
//        System.out.println(b[0][0] == 'a');
//        System.out.println(
//        String c = "acd";
        char[] c = b[0];
        for (char c1:c
             ) {
            System.out.println(c1);
        }

        char d = (char)(9+48);
        System.out.println(d);
//        System.out.println(c.con);
    }

    @Test
    public void test2(){
        int n = 16;
        System.out.println(n&(n-1));
    }
}
