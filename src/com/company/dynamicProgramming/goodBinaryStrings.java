package com.company.dynamicProgramming;

public class goodBinaryStrings {
    public static void main(String[] args) {
        System.out.println(countGoodStrings(1, 3, 2, 1));
        System.out.println(countGoodStrings(2, 3, 1, 2));
        System.out.println(countGoodStrings(2, 5, 3, 2));

    }

    private static int countGoodStrings(int minLength, int maxLength, int oneGroup, int zeroGroup) {
        int mod = (int) (10e9 + 7);

        int[] dp = new int[maxLength + 1];
        dp[0] = 1;

        for (int i = 0; i <= maxLength; i++) {
            if (dp[i] > 0) {
                int appendZeroes = i + zeroGroup;
                if (appendZeroes <= maxLength) {
                    dp[appendZeroes] += dp[i];
                    dp[appendZeroes] %= mod;
                }

                int appendOnes = i + oneGroup;
                if (appendOnes <= maxLength) {
                    dp[appendOnes] += dp[i];
                    dp[appendOnes] %= mod;
                }
            }
        }

        int result = 0;

        for (int i = minLength; i <= maxLength; i++) {
            result += dp[i];
            result %= mod;
        }

        return result;
    }
}
