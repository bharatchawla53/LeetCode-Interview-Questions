package com.company.arrays;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {100,10,1};
        System.out.println(maxAscendingSum(nums));
    }

    private static int maxAscendingSum(int[] nums) {
        int sum = 0;
        List<Integer> sumOfSubArrays = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i+1] > nums[i]) {
                    sum += nums[i];
                } else {
                    sum += nums[i];
                    sumOfSubArrays.add(sum);
                    sum = 0;
                }
            } else {
                sum += nums[i];
                sumOfSubArrays.add(sum);
            }
        }
        return Collections.max(sumOfSubArrays);
    }

}
