package com.company.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class removeAdjacentDuplicatesFromString {
    public static void main(String[] args) {
        String S = "abbaca";
        System.out.println(removeDuplicates(S));
    }

    private static String removeDuplicates(String S) {
        if (S == null) return null;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char temp = stack.pop();
           sb.append(temp);
        }

        return sb.reverse().toString();
    }

}
