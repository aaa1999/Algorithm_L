package com.hdoj;

import java.util.Scanner;

public class aAddB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.next() != "\n") {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

    }
}
