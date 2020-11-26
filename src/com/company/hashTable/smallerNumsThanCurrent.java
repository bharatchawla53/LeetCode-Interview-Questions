package com.company.hashTable;

import java.util.*;

public class smallerNumsThanCurrent {
    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        Arrays.stream(smallerNumsThanCurrentNum(nums)).forEach(System.out::println);
    }

    private static int[] smallerNumsThanCurrentNum(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] != nums[j] && nums[j] < nums[i]) {
                    counter++;
                }
            }
            result[i] = counter;
        }
        return result;
    }
}
