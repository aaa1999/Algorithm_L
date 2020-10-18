package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode126_1 {
    public static void main(String[] args) {

    }

    List<List<String>> result = new ArrayList<>();
    List<List<Integer>> path = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return result;
        int posendWord = 0;
        for (int i = 0;i < wordList.size();i++)  {
            if (wordList.get(i).equals(endWord)) posendWord = i + 1;
        }
        boolean[][] edges = new boolean[wordList.size() + 1][wordList.size() + 1];
        bfs(beginWord,endWord,wordList,edges);
        // edges已经转换为可达性的矩阵了。 可达为true
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
//        List<List<Integer>> path = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty()) {
            int now = queue.poll();
//            path.add(now);
            tmp.add(now);
            for (int i = 0;i < edges.length;i++ ) {
                if (edges[now][i]) queue.offer(i);
            }

        }




        return result;

    }

    public void bfs (String beginWord,String endWord,List<String> wordList,boolean[][] edges) {
        List<String> wordList2 = new ArrayList<>();
        wordList2.add(beginWord);
//        wordList2.add();
        for (String word :
                wordList) {
            wordList2.add(word);

        }
        for (int i = 0;i < wordList2.size();i++) {
            for (int j = 0;j < wordList2.size();j++) {
                edges[i][j] = compareTwoWords(wordList2.get(i),wordList2.get(j));
            }
        }



//        Queue<String> queue = new LinkedList<>();
//        queue.offer(beginWord);


    }

    public boolean compareTwoWords (String a1, String a2){
//        boolean flag = false;
        int count = 0;
        for (int i = 0; i < a1.length(); i++) {
            if (a1.charAt(i) != a2.charAt(i)) count++;
        }

        if (count == 1) return true;
        return false;

    }

    @Test
    public void test1 () {
//        int a = Integer.MAX_VALUE;
//        System.out.println(a);
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
//        a.set(0,0);

        System.out.println(a);
    }

    @Test
    public void test2 () {
        Queue<Integer> a = new LinkedList<>();
        a.offer(1);a.offer(2);
        System.out.println(a);
        a.poll();
        System.out.println(a);
    }
}
