package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode126 {
    public static void main(String[] args) {
        Leetcode126 leetcode126 = new Leetcode126();
//        leetcode126
        String beginWorld = "qa";
        String endWord = "sq";
        //  ["hot","dot","dog","lot","log","cog"]
//        List<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        String[] a = {"si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av","sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or","rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga","li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne","mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye"};

//        List<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        List<String> wordList = new ArrayList<>(Arrays.asList(a));

        long l = System.currentTimeMillis();
        List<List<String>> ladders = leetcode126.findLadders(beginWorld, endWord, wordList);
        long l2 = System.currentTimeMillis();
        System.out.println(ladders);
        System.out.println(l2 - l);

    }

    List<List<String>> result = new ArrayList<>();
    List<String> temp = new ArrayList<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return result;
//        result.add(new ArrayList<>(beginWord));
//        result.add(new ArrayList<String>())
        temp.add(new String(beginWord));
        dfs(beginWord, endWord, wordList);


        return result;
    }

    public void dfs(String beginWord, String endWord, List<String> wordList) {
//        if ()

        if (beginWord.equals(endWord)) {
            if (result.isEmpty()) {
                result.add(new ArrayList<>(temp));
                return;

            }
            int minlength = result.get(result.size() - 1).size();
            if (minlength > temp.size()) {
                return;
            }else if (minlength == temp.size()) {
                result.add(new ArrayList<>(temp));
                return;
            }else {
                result.removeAll(result);
                result.add(new ArrayList<>(temp));
                return;
            }
            /*
            if (temp.size() < minInList(result)) {
                result.removeAll(result);
                result.add(new ArrayList<>(temp));
                return;
            } else if (temp.size() == minInList(result)) {
                result.add(new ArrayList<>(temp));
                return;
            }else {
                return;
            }

             */
        }

            for (String word :
                    wordList) {
                if (!compareTwoWords(beginWord, word) || temp.contains(word)) continue;
                temp.add(new String(word));
                dfs(word, endWord, wordList);
                temp.remove(temp.size() - 1);
//                temp.add(new String(word));

            }
        }





    public int minInList(List<List<String>> a) {
//        if (a.isEmpty()) return
        int min = a.get(0).size();
        for (List<String> a1 :
                a) {
            if (a1.size() < min) min = a1.size();
        }

        return min;
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
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);
    }

    @Test
    public void test2 () {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(a);
    }
}
