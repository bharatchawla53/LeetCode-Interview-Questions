package com.company.strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class goalParser {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    private static String interpret(String command) {

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            stack.push(command.charAt(i));
            if (!stack.isEmpty()) {
                if (stack.peek() == ')') {
                    stack.pop();
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        sb.append('o');
                    } else if (!stack.isEmpty()) {
                        stack.pop();
                        stack.pop();
                        sb.append('a').append('l');
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        }
                    }
                } else if (stack.peek() == 'G'){
                    stack.pop();
                    sb.append('G');
                }
            }
        }
        return sb.toString();
    }
}
