package com.company.arrays;

public class maxAvgSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAvg(nums, k));
    }

    private static double findMaxAvg(int[] nums, int k) {
        double res = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            res = Math.max(res, sum);
        }

        return res / k;

    }
}
