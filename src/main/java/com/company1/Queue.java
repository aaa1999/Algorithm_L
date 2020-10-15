package com.company1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>();;
//        PriorityQueue<Integer> b = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        PriorityQueue<Integer> b = new PriorityQueue<>((a1,b1) -> {
            return b1 - a1;
        });
        a.offer(3);
        a.offer(4);
        a.offer(2);
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.poll());
        b.offer(3);
        b.offer(4);
        b.offer(2);
        System.out.println(b.poll());
        System.out.println(b.poll());
        System.out.println(b.poll());

    }
}
