package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class decompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Arrays.stream(decompressRLEList(nums)).forEach(System.out::println);
    }

    private static int[] decompressRLEList(int[] nums) {
        /*List<Integer> result = new ArrayList<>();
        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length; i+=2) {
                for (int j = 0; j < nums[i]; j++) {
                    result.add(nums[i+1]);
                }
            }
        }
        return result.stream().mapToInt(value -> value).toArray();*/
        int size = 0;
        for (int i = 0; i < nums.length; i+=2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int k =0 ;
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                result[k++] = nums[i+1];
            }
        }
        return result;
    }
}
