package com.company1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10_5_0 {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        Iterator<String> b = a.iterator();
        while (b.hasNext()){
            String str = b.next();
            if (str.equals("1")){
//                b.remove();
                a.remove(str);
            }
        }
        System.out.println(a);

    }
}
