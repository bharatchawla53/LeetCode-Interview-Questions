package com.company;

import java.util.Stack;

public class reverseInteger {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverseUsingStringConversion(x));
        System.out.println(reverse(x));
    }

    private static int reverse(int x) {
        // 123 --> 321
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return isNegative ? (int) result * -1 : (int) result;
    }

    private static int reverseUsingStringConversion(int x) {
        // 123 --> 321
        StringBuilder sb = new StringBuilder();
        String num = Integer.toString(x);
        if (num.charAt(0) == '-') {
            sb.append(num.charAt(0));
            num = num.substring(1);
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            stack.push(num.charAt(i));
        }

        for (int i = 0; i < num.length(); i++) {
            sb.append(stack.pop());
        }

        long temp = Long.parseLong(sb.toString());
         if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
             return 0;
         } else {
             return (int) temp;
         }
    }
}
