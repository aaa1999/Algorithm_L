package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode733 {

    public static void main(String[] args) {
        Leetcode733 leetcode733 = new Leetcode733();
        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        leetcode733.floodFill(image,1,1,2);
        for (int i = 0;i < image.length;i++){
            for (int j = 0;j < image[0].length;j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
//    List<Integer> target = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int pos = image[sr][sc];
//        boolean[][] visit = new boolean[image.length][image[0].length];
        dfs(image, sr, sc, pos);
//        for (int i = 0;i < image.length;i++){
//            System.out.println(i);
//        }
//        System.out.println(ans);
        System.out.println(ans);
        for (List<Integer> ans1 :
                ans
        ){
            image[ans1.get(0)][ans1.get(1)] = newColor;
        }
        return image;

    }

    public void dfs (int[][] image,int sr,int sc,int pos){
//        System.out.println(sr +" " + sc);
        List<Integer> target = new ArrayList<>();
        target.add(sr);
        target.add(sc);
        if (sr >= image.length || sr < 0|| sc >= image[0].length || sc < 0|| ans.contains(target) ) return;
        if (image[sr][sc] == pos) {
            ans.add(new ArrayList<>(target));
//            List<Integer> target = new ArrayList<>();
        }else {
            return;
        }


        int[][] res= {
                {1,0},
                {-1,0},
                {0,1},
                {0,-1}
        };

        for (int[] res1 :
                res) {
                dfs(image, sr + res1[0],sc + res1[1], pos);
        }
//        List<List<Integer>> res = new ArrayList<>({
//
//        })


//        if (image[sr][sc] == pos){
//            System.out.println(sr +"  " + sc);
//            target.add(sr);
//            target.add(sc);
//            if (!ans.contains(target)) ans.add(new ArrayList<>(target));
//            else return;
//            dfs(image, sr + 1, sc, pos);
//            dfs(image, sr - 1, sc, pos);
//            dfs(image, sr, sc + 1, pos);
//            dfs(image, sr, sc - 1, pos);
//        }else return;
    }

    @Test
    public void test1(){

        List<Integer> target = new ArrayList<>();
//        target.add(1,1);
//        System.out.println(target);
    }
}
