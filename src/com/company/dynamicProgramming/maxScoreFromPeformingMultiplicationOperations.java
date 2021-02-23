package com.company.dynamicProgramming;


public class maxScoreFromPeformingMultiplicationOperations {
    public static int[][] dp;
    public static void main(String[] args) {
        int[] nums = {-5,-3,-3,-2,7,1};
        int[] multipliers = {-10,-5,3,4,6};

        System.out.println(maxScore(nums, multipliers));
    }

    private static int maxScore(int[] nums, int[] multipliers) {
       int l = 0;
       //int r = nums.length-1;
       int index = 0;
       dp = new int[multipliers.length][multipliers.length];
       return helper(nums, multipliers, l, index);
    }

    private static int helper(int[] nums, int[] multipliers, int l, int index) {
        if (index >= multipliers.length) {
            return 0;
        }

        //check if the values are already calculated
        if (dp[l][index] != 0) {
            return dp[l][index];
        }

        //end index
        int end = (nums.length-1) - (index-l);

        //first choice - pick first element
        int choice1 = multipliers[index] * nums[l] + helper(nums, multipliers, l + 1, index + 1);
        //second choice - pick last element
        int choice2 = multipliers[index] * nums[end] + helper(nums, multipliers, l, index+1);

        return dp[l][index] = Math.max(choice1, choice2);
    }
}
