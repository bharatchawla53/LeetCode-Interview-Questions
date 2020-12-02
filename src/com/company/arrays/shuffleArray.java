package com.company.arrays;

import java.util.Arrays;

public class shuffleArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,3,4,7};
        int n = 3;
        Arrays.stream(shuffle(nums, n)).forEach(System.out::println);
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int k = 0;
        for (int i = 0, j = i+n; i < n; i++,j++) {
            result[k++] = nums[i];
            result[k++] = nums[j];

        }
        return result;
    }
}
