package com.company.strings;

import java.util.Arrays;

public class shortestDistanceToChar {
    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        Arrays.stream(shortestToChar(S, C)).forEach(System.out::print);
    }

    private static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int cPos = -S.length();
        //checking from left to right
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                cPos = i;
            }
            result[i] = i - cPos;
        }

        //checking from right to left
        for (int i = S.length()-1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                cPos = i;
            }
            result[i] = Math.min(result[i], Math.abs(i-cPos));
        }
        return result;
    }
}
