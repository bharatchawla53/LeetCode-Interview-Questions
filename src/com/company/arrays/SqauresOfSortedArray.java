package com.company.arrays;

import java.util.Arrays;

public class SqauresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        Arrays.stream(sortedSquares(nums)).forEach(System.out::println);
    }

    private static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
