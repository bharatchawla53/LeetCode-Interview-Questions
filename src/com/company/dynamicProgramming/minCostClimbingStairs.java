package com.company.dynamicProgramming;

public class minCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCost(cost));
    }

    private static int minCost(int[] cost) {
        int step1 = 0;
        int step2 = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            int curr = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = curr;
        }
        return Math.min(step1, step2);
    }
}
