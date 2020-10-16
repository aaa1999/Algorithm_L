package com.company;

import com.sun.deploy.security.BadCertificateDialog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode130 {
    public static void main(String[] args) {

        Leetcode130 leetcode130 = new Leetcode130();
        char[][] board2 = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
//        System.out.println(board);
        // [["O","X","O"],["X","O","X"],["O","X","O"]]
        char[][] board = {
                {'O','X','O'},
                {'X','O','X'},
                {'O','X','O'}
        };
        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[0].length;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        leetcode130.solve(board);
        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[0].length;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void solve(char[][] board) {
        List<List<Integer>> letterO = findLetterO(board);
//        boolean[][] visited = new boolean[board.length][board[0].length];
        boolean flag = false;
        List<List<Integer>> letter3 = new ArrayList<>();
        for (List<Integer> letter2:
        letterO){
            if (letter3.contains(letter2)) continue;
            boolean[][] visited = new boolean[board.length][board[0].length];

            if (visited[letter2.get(0)][letter2.get(1)]) continue;
            dfs(board,letter2.get(0),letter2.get(1),visited);
            for (int i = 0;i < board.length;i++){
                for (int j = 0;j < board[0].length;j++){
                    if (visited[i][j] && (i == 0 || j == 0 || i == board.length-1 || j == board[0].length - 1)) {
                        flag = true;
//                        letter0.re
//                        letterO.remove(new ArrayList<>(Arrays.asList(i,j)));
//                        letter3.add();
                        letter3.add(new ArrayList<>(Arrays.asList(i,j)));
//                        continue;
                    }
                }
            }

            if (flag) {

                flag = false;
                continue;
            }else {
                for (int i = 0;i < board.length;i++) {
                    for (int j = 0;j < board[0].length;j++) {
//                        letterO.remove(new ArrayList<>(Arrays.asList(i,j)));
                        if (visited[i][j])
                        {
                            letter3.add(new ArrayList<>(Arrays.asList(i,j)));

                            board[i][j] = 'X';
                        }
                    }
                }
            }
        }
//        flag = false;

    }

//    boolean[][] visit =
    public void dfs (char[][] board,int row,int col,boolean[][] visited) {
//        if (visited[posLetterO.get(0)][posLetterO.get(1)]) return;
//        if (visited[row][col] || board[row][col] != 'O') return;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) return;
        if (visited[row][col]) return ;
        if (board[row][col] != 'O') return ;

//        visited[posLetterO.get(0)][posLetterO.get(1)] = true;
        visited[row][col] = true;

        int[][] direction = {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        for (int[] dir :
                direction) {

//            if (!dfs(board, row + dir[0], col + dir[1], visited)) return false;
            dfs(board, row + dir[0], col + dir[1], visited);

        }

    }

    public List<List<Integer>> findLetterO (char[][] board) {
        List<List<Integer>> poses = new ArrayList<>();
        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[0].length;j++) {
                if (board[i][j] == 'O') {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    poses.add(new ArrayList<>(temp));
                }
            }
        }
        return poses;
    }


    @Test
    public void test3 () {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4));
        for (Integer a1:a) {
            System.out.println(a1);
//            a.add(3);
//            System.out.println(a.remove(a.size() -1 ));
        }
//                add (1),
//                add (2)
//        });
    }

    @Test
    public void test1(){
        boolean[] a = new boolean[3];
        System.out.println(a[0]);
        test2(a);
        System.out.println(a[0]);

    }


    @Test
    public void test2(boolean[] booleans) {
        booleans[0] = true;
//        booleans[0][0]
    }

}
