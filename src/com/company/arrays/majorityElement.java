package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majElement(nums));
    }

    private static int majElement(int[] nums) {
        int majEle = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            if (value.getValue() > majEle){
                return value.getKey();
            }
        }
        return 0;
    }
}
