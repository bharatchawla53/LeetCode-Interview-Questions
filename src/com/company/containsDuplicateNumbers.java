package com.company;

import java.util.HashMap;

public class containsDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1};
        checkDuplicates(arr);
    }

    private static boolean checkDuplicates(int[] arr) {
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (counter.containsKey(arr[i])) {
                counter.put(arr[i],  counter.get(arr[i] + 1));
                return true;
            } else {
                counter.put(arr[i], 1);
            }
        }
        return false;
    }

}
