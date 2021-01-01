package com.company.stack;

import java.util.*;

public class nextGreaterElementII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,3}; //output 2,-1,2
        Arrays.stream(nextGElement(nums1)).forEach(System.out::println);
    }

    private static int[] nextGElement(int[] nums1){

        //brute force
       /* int[] result = new int[nums1.length];
        int[] doubleArray = new int[nums1.length * 2];

        System.arraycopy(nums1, 0, doubleArray, 0, nums1.length);
        System.arraycopy(nums1, 0, doubleArray, nums1.length, nums1.length);

        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;
            for (int j = i+1; j < doubleArray.length; j++) {
                if (doubleArray[j] > doubleArray[i]) {
                    result[i] = doubleArray[j];
                    break;
                }
            }
        }
        return result;*/
        int[] result = new int[nums1.length];
        Deque<Integer> stack = new ArrayDeque<>();
        Arrays.fill(result, -1);


        for (int i = 0; i < 2 * nums1.length; i++) {
            while (!stack.isEmpty()  && nums1[stack.peek()] < nums1[i % nums1.length]) {
                result[stack.pop()] = nums1[i % nums1.length];
            }
            if (i < nums1.length) {
                stack.push(i);
            }
        }
        return result;
    }
}
