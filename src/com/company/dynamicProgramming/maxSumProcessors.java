package com.company.dynamicProgramming;

public class maxSumProcessors {
    public static void main(String[] args) {
        System.out.println(getMaxPower(7, new int[]{3,3,3,4,4,1,8}));
        System.out.println(getMaxPower(5, new int[]{1,2,3,4,5}));
    }

    private static int getMaxPower(int n, int[] power) {
        int[] dp = new int[n + 1];
        dp[0] = power[0];
        dp[1] = Math.max(power[0], power[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + power[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
