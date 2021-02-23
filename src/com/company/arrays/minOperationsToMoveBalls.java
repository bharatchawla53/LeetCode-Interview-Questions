package com.company.arrays;

import java.util.Arrays;

public class minOperationsToMoveBalls {
    public static void main(String[] args) {
        String boxes = "001011";
        Arrays.stream(minOperations(boxes)).forEach(System.out::println);
    }

    private static int[] minOperations(String boxes) {
        //110
        // i = 1 ==> 1
        // i = 2 ==> 1
        // i = 3 ==> 3
        int[] result = new int[boxes.length()];
        int counter = 0;
        for (int i = 0; i < boxes.length(); i++) {
            if (i + 1 < boxes.length()) {
                for (int j = i + 1; j < boxes.length(); j++) {
                    if (boxes.charAt(j) == '1') {
                        counter += j -i;
                    }
                }
            }

            if (i - 1 > -1) {
                for (int k = i - 1; k > -1; k--){
                    if (boxes.charAt(k) == '1') {
                        counter += i - k;
                    }
                }
            }

           result[i] = counter;
           counter = 0;
        }
        return result;
    }
}
