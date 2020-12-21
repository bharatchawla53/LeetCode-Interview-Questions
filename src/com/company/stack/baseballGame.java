package com.company.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class baseballGame {
    public static void main(String[] args) {
        String[] ops = {"1"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        Deque<String> stack = new ArrayDeque<>();
        int result = 0;

        for (int i = 0; i < ops.length; i++) {
            String c = ops[i];

            if (c.equals("+")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(num2));
                stack.push(String.valueOf(num1));
                stack.push(String.valueOf(num1+num2));
            } else if (c.equals("D")) {
                stack.push(String.valueOf(Integer.parseInt(stack.peek()) * 2));
            } else if (c.equals("C")) {
                stack.remove();
            } else {
                stack.push(c);
            }

        }

        while(!stack.isEmpty()){
            result += Integer.parseInt(stack.pop());
        }
        return result;
    }
}
