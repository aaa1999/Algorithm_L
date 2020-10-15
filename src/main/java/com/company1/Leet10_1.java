package com.company1;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Leet10_1 {
    public static void main(String[] args) {
//        Set<Integer> a = new TreeSet<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        System.out.println(a);
//        Map<Integer, String> map = new HashMap();
//        map.put(1, "Java");
//        map.put(2, "C++");
//        map.put(3, "PHP");
//        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            System.out.println(entry.getKey() + entry.getValue());
//        }
//        ConcurrentHashMap<String,String> a = new ConcurrentHashMap<>();
//        a.put("a","b");
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(1);
//        int[] b = {1,2,5,4};
//        Arrays.sort(b);
//        Arrays.binarySeaarch(b,3);
//        System.out.println(Arrays.binarySearch(b, 5));
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(a);
    }
    public int dfs(int n){
        if (n == 1 || n == 2) return 1;
        return dfs(n - 1) + dfs(n - 1);
    }

    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        int a = dfs(30);
        long end = System.currentTimeMillis();
        System.out.println(a);
        System.out.println(end - start);
    }
}
