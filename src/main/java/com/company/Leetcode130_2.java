package com.company;

import java.util.ArrayList;
import java.util.List;

public class Leetcode130_2 {

    public static void main(String[] args) {
        Leetcode130_2 leetcode130_2 = new Leetcode130_2();
//        leetcode130_2.solve();
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] board2 = {
                {'O','X','O'},
                {'X','O','X'},
                {'O','X','O'}
        };
        leetcode130_2.printBoard(board);
        System.out.println();
        leetcode130_2.solve(board);
        leetcode130_2.printBoard(board);
        System.out.println();

    }

    public void solve(char[][] board) {
        List<List<Integer>> letterO = findLetterO(board);
//        printBoard(board);
        for (List<Integer> letter2:
        letterO){
            dfs(board,letter2.get(0),letter2.get(1));
        }
//        System.out.println();
//        printBoard(board);

        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[0].length;j++) {
                if (board[i][j] == 'A') board[i][j] = 'O';
                else if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }

    }

    public void dfs (char[][] board,int row,int col) {
        if (row < 0 || col < 0 || row > board.length - 1 || col > board[0].length - 1 || board[row][col] != 'O') return;
        board[row][col] = 'A';
        int[][] directions = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };
        for (int[] dir :
                directions) {
            dfs(board, row + dir[0], col + dir[1]);
        }

    }

    public List<List<Integer>> findLetterO (char[][] board) {
        List<List<Integer>> poses = new ArrayList<>();
        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[0].length;j++) {
                if (board[i][j] == 'O' && (i == 0 || j == 0 || i == board.length - 1 || j == board[0].length - 1)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    poses.add(new ArrayList<>(temp));
                }
            }
        }
        return poses;
    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
