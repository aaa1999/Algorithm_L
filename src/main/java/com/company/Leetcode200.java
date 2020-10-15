package com.company;

import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode200 {
    public static void main(String[] args) {
        Leetcode200 leetcode200 = new Leetcode200();
        char[][] grid2 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}

        };
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}

        };
//        int i = leetcode200.numIslands(grid);
        int i = leetcode200.numIslands(grid);
        System.out.println(i);

    }

    public int numIslands(char[][] grid) {

        List<List<Integer>> theOnePos = new ArrayList<>();
        for (int i = 0;i < grid.length;i++) {
            for (int j = 0;j < grid[0].length;j++) {
                if (grid[i][j] == '1') {
                    List<Integer> a = new ArrayList<>();
                    a.add(i);a.add(j);
                    theOnePos.add(new ArrayList<>(a));
                }
            }
        }
        System.out.println("hahah");
        for (List<Integer> theOnePos2:
        theOnePos){

            if (visited[theOnePos2.get(0)][theOnePos2.get(1)]) continue;
            dfs(grid,theOnePos2.get(0),theOnePos2.get(1),countOnes,theOnePos.size());
            count ++;
        }
        return count;
    }

    int count = 0;

    int countOnes = 0;

    boolean[][] visited = new boolean[300][300];

    public void dfs (char[][] grid, int row, int col, int countOnes, int allOnes) {

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return;

        if (countOnes == allOnes) return;

        if (grid[row][col] != '1') return;

        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };

//        for (List<Integer> onePos : theOnePos) {
//            if (visited[row][col]) return;
        if (visited[row][col]) return;
        visited[row][col] = true;
        countOnes += 1;
        for (int[] dir :
                directions) {
//            if (grid[row][col] == '1') {
//            if (visited[row][col]) continue;
//            visited[row][col] = true;
//            countOnes += 1;
            dfs(grid, row + dir[0], col + dir[1], countOnes, allOnes);
//            }
        }

//            count++;
//            count ++;
//        }
    }

    @Test
    public void test1(){
        int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
//        List<List<Integer>> dirs2 = new ArrayList<Integer>(Arrays.asList(directions));
        int[] dir = {1,2,3};
//        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> a = new ArrayList<Integer>(){{
            add (1);
            add(2);
            add(3);
        }};
        System.out.println(a);
//        List<String> cups = List.of("A", "B", "C");
//        System.out.println(cups);
    }
}
