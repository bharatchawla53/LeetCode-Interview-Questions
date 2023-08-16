package com.company.arrays;

import java.util.Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0,  -3, 3};
        int[] answer = product(nums);

        for (int num : answer) {
            System.out.println(num);
        }
    }

    private static int[] product (int[] nums) {
        int[] answer = new int[nums.length];

        int[] db = new int[nums.length];
        Arrays.fill(db, 1);

        for (int i = 1; i < nums.length; i++) {
            db[i] = db[i - 1] * nums[i];
        }

        for (int num : db) {
            System.out.println(num);
        }

        return answer;
    }
}
