package com.company.stack;

import java.util.*;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        Arrays.stream(nextGElement(nums1, nums2)).forEach(System.out::println);
    }

    //[-1,3,-1] output
    private static int[] nextGElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        int index = 0;
        for (int num : nums1) {
            result[index++] = map.getOrDefault(num, -1);
        }

        //brute force
        /*int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    //change here
                    int foundGreatNumber = 0;
                    for (int k = j; k < nums2.length; k++) {
                        if (k+1 < nums2.length) {
                            if (nums1[i] < nums2[k+1]) {
                                foundGreatNumber = nums2[k+1];
                                break;
                            }
                        }
                    }
                    if (nums1[i] < foundGreatNumber) {
                        result[index++] = foundGreatNumber;
                    } else {
                        result[index++] = -1;
                    }
                }
            }
        }*/
        return result;
    }
}
