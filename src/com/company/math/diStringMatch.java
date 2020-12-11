package com.company.math;

import java.util.Arrays;

public class diStringMatch {
    public static void main(String[] args) {
        String S = "IDID";
        Arrays.stream(stringMatch(S)).forEach(System.out::println);
    }

    private static int[] stringMatch(String S) {
        int[] A = new int[S.length()+1];
        int low = 0, high = S.length();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                A[i] = low++;
            } else {
                A[i] = high--;
            }
        }
        A[S.length()] = low;

        return A;
    }
}
