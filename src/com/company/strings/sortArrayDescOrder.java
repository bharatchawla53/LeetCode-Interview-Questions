package com.company.strings;

import java.util.Arrays;

public class sortArrayDescOrder {
    public static void main(String[] args) {
        String[] heights = new String[]{"SHORT", "TALL", "TALL", "SHORT"};
        Arrays.stream(sort(heights)).forEach(System.out::println);
    }

    private static String[] sort(String[] heights) {
        for (int i = 0; i < heights.length -1; i++) {
            for (int j = i+1; j < heights.length; j++) {
                if (heights[i].compareTo(heights[j]) < 0) {
                    String temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        return heights;
    }
}
