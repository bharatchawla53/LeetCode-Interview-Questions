package com.company.hashTable;

public class containsDuplicateIII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        int t = 0;
        System.out.println(containsDuplicate(nums, k, t));
    }

    private static boolean containsDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k; j++) {
                if (Math.abs(nums[i] - nums[j]) <= t) {
                    return true;
                }
            }
        }
        return false;
    }
}
