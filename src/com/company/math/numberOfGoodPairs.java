package com.company.math;

public class numberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    private static int numIdenticalPairs(int[] nums) {
        int pairCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
}
