package com.company;

class Leetcode79_0 {
    public static void main(String[] args) {
        Leetcode79_0 leetcode79_0 = new Leetcode79_0();
        char[][] board2 = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        char[][] board = {
                {'a','a','a','a'},
                {'a','a','a','a'},
                {'a','a','a','a'}
        };
        /*
        char[][] board = {
                {'a','a'}
        };

         */
        /*
        char[][] board = {
                {'a'}
        };

         */
//        String word = "ABCCED";
//        String word = "aaaaaaaaaaaaa";
        String word = "aaaaaaaaaaab";
//        String word = "aa";
        boolean result = leetcode79_0.exist(board,word);
        System.out.println(result);
    }
    public boolean exist(char[][] board, String word) {
        int h = board.length, w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        long start = System.currentTimeMillis();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
                System.out.print("(" + i + " " + j + ") ");
            }
            System.out.println();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return false;
    }

    public boolean check(char[][] board, boolean[][] visited, int i, int j, String s, int k) {
        if (board[i][j] != s.charAt(k)) {
            return false;
        } else if (k == s.length() - 1) {
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean result = false;
        for (int[] dir : directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                if (!visited[newi][newj]) {
                    boolean flag = check(board, visited, newi, newj, s, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}

