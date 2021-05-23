package com.company.strings;

public class longerContiguousSegementsOfOnes {
    public static void main(String[] args) {
        String s = "111000";
        System.out.println(checkZeroOnes(s));
    }

    private static boolean checkZeroOnes(String s) {
        int LongestOne = Integer.MIN_VALUE;
        int LongestZero = Integer.MIN_VALUE;
        
        int currLongestOne = 0; 
        int currLongestZero = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                currLongestZero++;
                LongestZero = Math.max(LongestZero, currLongestZero);
                currLongestOne = 0;
            } else {
                currLongestOne++;
                LongestOne = Math.max(LongestOne, currLongestOne);
                currLongestZero = 0;

            }
        }

        return LongestOne > LongestZero;
    }
    
}
