package com.company;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("hello my friends"));

        System.out.println("abcd".charAt(0));

        System.out.println("abcd".substring(1));
    }

    private static String reverse(String string){
        return string.isEmpty()? string:reverse(string.substring(1))+string.charAt(0);
    }
}
