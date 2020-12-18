package com.company.arrays;

import java.util.Arrays;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        int counter = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] != nums[i+1]) {
                if (nums[i+1] - nums[i] == 1) {
                   counter++;
                } else {
                    counter = 1;
                }
            }
            if (counter > result) {
                result = counter;
            }
        }
        return result;
    }
}
