package com.company.arrays;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1,2, -1, -4};
        sum(nums);
    }

    private static List<List<Integer>> sum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> findTriplets = new ArrayList<>();
                    findTriplets.add(nums[i]);
                    findTriplets.add(nums[l]);
                    findTriplets.add(nums[r]);
                    result.add(findTriplets);
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}
