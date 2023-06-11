package com.company.dynamicProgramming;

public class CoinDenominations {
    public static void main(String[] args) {
        int n = 30;
        int[] D = new int[]{1, 5, 10, 25};
        System.out.println("Number of distinct ways: " +
                numberOfDistinctWays(n, D));

    }

    private static int numberOfDistinctWays(int n, int[] D) {
        int[][] C = new int[n][D.length];

        for (int i = 0; i < D.length; i++) {
            C[0][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= D.length; j++) {
                if (D[j - 1] <= i) {
                    C[i - 1][j - 1] = C[i - D[j - 1] - 1][j - 1] + C[i - 1][j - 1];
                }
            }
        }

        return C[n - 1][D.length - 1];
    }
}