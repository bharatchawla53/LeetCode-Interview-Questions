package com.company.strings;

public class MaxDepthOfParenthesis {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {
        int depth = 0, count = 0;
        for(char c : s.toCharArray()){
            if (c == '(') {
                count++;
            } else if ( c == ')') {
                count--;
            }
            depth = Math.max(depth, count);
        }
        return depth;
    }
}
