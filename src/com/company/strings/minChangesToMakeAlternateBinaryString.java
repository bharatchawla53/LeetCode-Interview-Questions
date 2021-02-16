package com.company.strings;

public class minChangesToMakeAlternateBinaryString {
    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));
    }

    private static int minOperations(String s) {
        int numOfOperations = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i+1 < chars.length) {
                if (chars[i] != chars[i+1]) {
                    continue;
                } else {
                    if (chars[i] == '0') {
                        chars[i+1] = '1';
                    } else {
                        chars[i+1] = '0';
                    }
                    numOfOperations++;
                }
            }
        }

        return Math.min(numOfOperations, s.length()-numOfOperations);
    }
}
