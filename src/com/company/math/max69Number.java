package com.company.math;

public class max69Number {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }

    private static int maximum69Number(int num) {
        char[] s = Integer.toString(num).toCharArray();

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '6'){
                s[i] = '9';
                return Integer.parseInt(String.valueOf(s));
            }
        }
        return Integer.parseInt(String.valueOf(s));
    }
}
