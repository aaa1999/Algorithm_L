package com.atcoder;

import lombok.Data;

@Data
public class My {
    private int age;
    private String name;

    public static void main(String[] args) {
        My my = new My();
        my.setAge(12);
        my.setName("dad");
        System.out.println(my.getAge());
    }
}
