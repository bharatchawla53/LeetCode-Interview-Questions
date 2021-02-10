package com.company.arrays;

import java.util.Arrays;

public class numOfLinesToWriteString {
    public static void main(String[] args) {
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        Arrays.stream(numberOfLines(widths, s)).forEach(System.out::println);
    }

    private static int[] numberOfLines(int[] widths, String s) {
        int index = 0;
        int maxWidth = 0;
        int lines = 1;

        while (index < s.length()) {
            maxWidth += widths[s.charAt(index) - 'a'];
            if (maxWidth > 100) {
                maxWidth = widths[s.charAt(index) - 'a'];
                lines++;
            }
            index++;
        }
        return new int[]{lines, maxWidth};
    }
}
