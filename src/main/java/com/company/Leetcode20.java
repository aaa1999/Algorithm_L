package com.company;

import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
        Leetcode20 leetcode20 = new Leetcode20();
        String s = "()";
        boolean valid = leetcode20.isValid(s);
        System.out.println(valid);

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i < s.length();i++) {
            char s1 = s.charAt(i);
            if (s1 == '(' || s1 == '[' || s1 == '{') stack.push(s1);
            else if (!stack.isEmpty()) {
                if (s1 == ']' && stack.peek() == '[') stack.pop();
                else if (s1 == ')' && stack.peek() == '(') stack.pop();
                else if (s1 == '}' && stack.peek() == '{') stack.pop();
                else stack.push(s1);
            } else {
                stack.push(s1);
            }
        }
        if (stack.isEmpty()) return true;
        return false;

    }

}
