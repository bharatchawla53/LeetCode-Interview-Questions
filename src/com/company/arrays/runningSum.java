package com.company.arrays;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        Arrays.stream(running1dSum(nums)).forEach(System.out::println);
    }

    private static int[] running1dSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0) {
                sum = nums[i] + result[i-1];
            } else {
                sum = nums[i] + result[i];
            }
            result[i] = sum;
        }
        return result;
    }
}
