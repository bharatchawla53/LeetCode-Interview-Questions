package com.company.hashTable;

import java.util.HashMap;

public class repeatedElementInArray {
    public static void main(String[] args) {
        int[] A = new int[]{9,5,3,3};
        System.out.println(repeatedNTimes(A));
    }

    private static int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                return key;
            }
        }

        return 0;
    }
}
