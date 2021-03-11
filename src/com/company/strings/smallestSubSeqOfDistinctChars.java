package com.company.strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class smallestSubSeqOfDistinctChars {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(smallestSubSequence(s));
    }

    private static String smallestSubSequence(String s) {
       Map<Character, Integer> map = new HashMap<>();
       StringBuilder sb = new StringBuilder();

       //get the counts of each character.
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // store the characters in a stack
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            //if stack is empty push the element
            // and decrement the value of that element in the map
            if (stack.isEmpty()) {
                stack.push(c);
                map.put(c, map.get(c)-1);
                continue;
            }

            //peek the element and pop if it is greater than current
            while (stack.size() > 0 && c < stack.peek()) {
                if (!stack.contains(c) && map.get(stack.peek()) > 0) {
                    stack.pop();
                } else {
                    break;
                }
            }

            // if stack does not contain char, then push it
            if (!stack.contains(c)) {
                stack.push(c);
            }

            map.put(c, map.get(c) -1);
        }

        stack.forEach(sb::append);

        return sb.reverse().toString();
    }
}
