package com.company.strings;

public class reverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverse(s);
    }

    private static void reverse(char[] s) {
        int len = s.length-1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[len];
            s[len] = s[i];
            s[i] = temp;
            len--;
        }
    }
}
