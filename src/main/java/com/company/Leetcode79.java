package com.company;

import org.junit.jupiter.api.Test;
//import

import java.util.ArrayList;

public class Leetcode79 {
    public static void main(String[] args) {
        Leetcode79 leetcode79 = new Leetcode79();
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
        boolean result = leetcode79.exist(board,word);
        System.out.println(result);
    }

    public boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        ArrayList<int[]> poss = findFromBoardForPos(board,word.charAt(0));
        if (poss.isEmpty()) return false;
        if (word.length() == 1) return true;
//        if (word.length() == )
//        if (poss.size() > board.length * board[0].length || poss.size() < word.length()) return false;
        if (word.length() > board.length * board[0].length) return false;
//        else  if (word.length() == board.length * board[0].length)
        boolean result = false;
        long start = System.currentTimeMillis();

        for (int[] a:
                poss
             ) {

            result = dfs2(board,word,0,a[0],a[1],visited);
            if (result) break;
            visited = new boolean[board.length][board[0].length];
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return result;
    }

    // row 为第一个字母在board上的位置坐标

    // row,col可能没有  也可能有多个  为此，我在主函数exist中进行判断
    public boolean dfs2 (char[][] board,String word,int posNow,int row,int col,boolean[][] visited){

        if ( posNow == word.length()  ) return true;
//        if ((posNow == 0) && word.length() ==1) return true;

        if (posNow < 0) return false;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
//        boolean flag = false;
        if (board[row][col] == word.charAt(posNow) && visited[row][col] == false){
            visited[row][col] = true;
            for (int[] dir :
                    directions) {
                int new_Row = row + dir[0];
                int new_Col = col + dir[1];
                if (new_Row < board.length && new_Row > -1 && new_Col < board[0].length && new_Col > -1){
                    if (dfs2(board, word, posNow + 1, new_Row, new_Col,visited)){
                        return true;
                    }else {
//                        new_Row = row
                        continue;
                    }
                }
            }
            visited[row][col] = false;
//            dfs2(board, word, posNow - 1, row, col,visited);
        }else {
            return false;

        }
//        if (board[row][col] == word.charAt(posNow)){
//            if (row + 1 < board.length) {
//                if (dfs2(board, word, posNow + 1, row + 1, col)) return true;
//                dfs2(board, word, posNow -1 , row - 1, col);
//            }else {
//
//            }
//
//
//        }else {
//
//        }
        return false;
    }

    public boolean dfs (char[][] board,String word,int wordI,ArrayList<int[]> pos){
        if (word.length() == wordI)  return true;

        // 判断选择的合法性   防止走向重复

        // 做个选择
        pos = findFromBoardForPos(board,word.charAt(wordI));
        if (pos.isEmpty()) return false;
        else{
            for (int[] pos1:pos
                 ) {

                if (dfs (board, word, wordI + 1, pos)) return false;
            }
        }


        //

        return true;

    }

    private ArrayList<int[]> findFromBoardForPos(char[][] board, char charAt) {
//        int
        ArrayList<int[]> b = new ArrayList<>();
        for (int i = 0;i < board.length;i++){
            for (int j = 0;j < board[0].length;j++){
                if (board[i][j] == charAt) {
//                    a = new int ;
                    int[] a = {i,j};
                    b.add(a);
//                    a[0] = i;
                }
            }

        }


        return b;
    }

    @Test
    public void test1(){
        char[][] a = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'1','2','3'},
        };
        ArrayList<int[]> b = findFromBoardForPos(a,'1');

//        System.out.println(a.length);
//        System.out.println(a[0].length  );
//        System.out.println(b);
        for (int[] b1:b
             ) {
            System.out.println(b1[0] +" " +  b1[1]);
        }
    }
}
