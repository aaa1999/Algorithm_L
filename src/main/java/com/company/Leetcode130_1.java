package com.company;

/*
    dfs algothrim
    more excellent than mine
 */
public class Leetcode130_1 {
    public static void main(String[] args) {
        Leetcode130_1 leetcode130_1 = new Leetcode130_1();
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };


        leetcode130_1.printBoard(board);
        System.out.println();
        leetcode130_1.solve(board);

        System.out.println();
        leetcode130_1.printBoard(board);
        System.out.println();
    }


    int n, m;

    public void solve(char[][] board) {
        n = board.length;
        if (n == 0) {
            return;
        }
        m = board[0].length;
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
//            printBoard(board);
            dfs(board, i, m - 1);
//            printBoard(board);
        }
        for (int i = 1; i < m - 1; i++) {
            dfs(board, 0, i);
//            printBoard(board);
            dfs(board, n - 1, i);
//            printBoard(board);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || board[x][y] != 'O') {
            return;
        }
        board[x][y] = 'A';
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);

//        int[][] directions = {
//                {1,0},
//                {-1,0},
//                {0,1},
//                {0,-1}
//        };
//
//        for (int[] dir :
//                directions) {
//            dfs(board, x + dir[0], y + dir[1]);
//        }
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


