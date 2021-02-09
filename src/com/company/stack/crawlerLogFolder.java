package com.company.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class crawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"./","../","./"};
        System.out.println(minOperations(logs));
    }

    private static int minOperations(String[] logs) {
        Deque<String> stack = new ArrayDeque<>();
        for (String log : logs) {
            if (log.equals("./")){
                continue;
            }
            if (log.equals("../") && !stack.isEmpty()) {
                stack.pop();
            } else {
                if (!log.equals("../")){
                    stack.push(log);
                }
            }

        }
        return stack.size();
    }
}
