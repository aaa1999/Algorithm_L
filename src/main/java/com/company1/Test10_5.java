package com.company1;

import java.util.*;

public class Test10_5 {
    public static void main(String[] args) {
        /*
        List<String> a = new ArrayList<>();
        a.add("dada");a.add("da");
        List<String> b = new ArrayList<>();
        b.add("哈哈哈");b.add("我的");
        Collections.copy(b,a);
        System.out.println(b);
        b.set(0,"我的");
        System.out.println(b);
        System.out.println(a);

         */

        /*
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(1);
        a.add(5);
        List<Integer> b = new ArrayList<>();

         */
//        b.add(1);b.add(2);b.add(4);
//        Collections.copy(b,a);
//        System.out.println(b);
//        Collections.sort(a);
//        System.out.println(a);
        /*
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(a);

         */
        /*
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(a);

         */
        /*
        Integer[] a = {4,2,4,1,5};
        Comparator my = new My();
        for (Integer a1 :
                a) {
            System.out.print(a1 + "\t");
        }
        System.out.println();
        Arrays.sort(a,my);
        for (Integer a1 :
                a) {
            System.out.print(a1 + "\t");
        }

         */

        /*
        for (Integer a1 :
                a) {
            System.out.print(a1+"\t");

        }
        Arrays.sort(a, Collections.reverseOrder());
        for (Integer a1 :
                a) {
            System.out.print(a1+"\t");

        }

         */

    }
}

class My implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
