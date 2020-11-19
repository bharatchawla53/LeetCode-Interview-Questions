package com.company.arrays;

import java.util.Arrays;

public class twoNumbersInputArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        Arrays.stream(twoSum(numbers, target)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] numbers, int target) {
       int start = 0;
       int end = numbers.length-1;

       while (start <= end ) {
           int sum = numbers[start] + numbers[end];
           if (sum == target) {
               return new int[]{start+1, end+1};
           } else if (sum > target) {
               end--;
           } else {
               start++;
           }
       }
       return new int[]{};
    }


}
