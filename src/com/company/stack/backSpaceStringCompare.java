package com.company.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class backSpaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(backSpaceCompare (S, T));
    }

    private static boolean backSpaceCompare(String S, String T) {
        return validateString(S).equals(validateString(T));
    }

    private static String validateString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96 && s.charAt(i) < 123) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty()){ // character is #
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
