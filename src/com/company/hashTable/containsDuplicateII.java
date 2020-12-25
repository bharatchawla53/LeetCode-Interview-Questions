package com.company.hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class containsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        System.out.println(containsDuplicate(nums, k));
    }

    private static boolean containsDuplicate(int[] nums, int k) {
       /* HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
               return true;
            }
            set.add(nums[i]);

            if (set.size() > k) {
                set.remove(nums[i-k]);
            }
        }
        return false;*/
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
