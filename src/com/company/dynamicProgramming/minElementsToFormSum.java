package com.company.dynamicProgramming;

public class minElementsToFormSum {
    public static void main(String[] args) {
        int[] nums = {1,-1,2};
        int limit = 3;
        int goal = -4;
        System.out.println(minElements(nums, limit, goal));
    }

    private static int minElements(int[] nums, int limit, int goal) {
        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum == goal) {
            return 0;
        }

        long diff = Math.abs(goal - sum);

        return diff % limit == 0 ? (int) (diff / limit) : (int) (diff / limit + 1);
    }
}
