package com.company;
import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Leetcode40_0 {
    public static void main(String[] args) {

        Leetcode40_0 leetcode40_0 = new Leetcode40_0();
        int[] l1 = {4,4,2,1,4,2,2,1,3};
//        int[] l1 ={10,1,2,7,6,1,5};
        /*
            [4,4,2,1,4,2,2,1,3]
            6
6
         */
//        int[] l1 = {2,5,2,1,2};
//        List<Set<Integer>> sets = leetcode40_0.combinationSum2(l1, 8);
//        Set<Set<Integer>> sets = leetcode40_0.combinationSum2(l1, 8);

        List<List<Integer>> lists = leetcode40_0.combinationSum2(l1, 6);
        System.out.println(lists);
    }

    Set<Integer> a = new HashSet<>();
    List<Integer> a1 = new ArrayList<>();
    List<Set<Integer>> b = new ArrayList<>();
    Set<Set<Integer>> b1 = new HashSet<>();
    Set<List<Integer>> b2 = new HashSet<>();
//    public void dfs (int[] nums)

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        dfs(candidates,0,target);
//        return b2;
        return set2list(b2);
    }
    public void dfs (int[] candidates,int pos,int target){
        if (sum1(a1) == target) {
//            System.out.println(a1);
//            System.out.println(a1);
//            Collections.sort(a1);
            List<Integer> a4  = new ArrayList<>();
            for (Integer a11:a1
                 ) {
                a4.add(a11);
            }
            Collections.sort(a4);
            b2.add(new ArrayList<>(a4));
//            b1.add(new HashSet<>(List2Set(a1)));
//            System.out.println(a1);
            return ;
        }
        if (sum1(a1) != target && pos == candidates.length) return;
        if (sum1(a1) > target) return;
//        if (candidates[pos] > target) return;
        for (int i = pos;i < candidates.length;i++){
            if (candidates[i] > target) continue;
            a1.add(candidates[i]);
            dfs(candidates, i + 1, target);
            a1.remove(a1.size() - 1);
        }

    }

    private Set<Integer> List2Set(List<Integer> a1){
        Set<Integer> a2 = new HashSet<>();
        for (Integer a11:a1
             ) {
            a2.add(a11);
        }
        return a2;
    }
    private int sum(Set<Integer> a) {
        int sum = 0;
        for (Integer a1:a
             ) {
            sum += a1;
        }
        return sum;
    }

    private int sum1 (List<Integer> a){
        int sum = 0;
        for (Integer a1 : a){
            sum += a1;
        }
        return sum;
    }

    private List<List<Integer>> set2list(Set<List<Integer>> a){
        List<List<Integer>> a2 = new ArrayList<>();
        for (List<Integer> a1:
        a){
            a2.add(a1);
        }
        return a2;
    }

    @Test
    public void test1(){
        a.add(1);
        a.add(2);
        a.add(2);
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()) System.out.println(b.next());
        for (Integer a1:a
             ) {
            System.out.println(a1);
        }
        System.out.println(a);

        List<Integer> a3 = new ArrayList<>();
        a3.add(3);
        a3.add(1);
        a3.add(2);
        System.out.println(a3);
//        a3.sort();
        Collections.sort(a3);
        System.out.println(a3);
    }
}
