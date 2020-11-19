package com.company.strings;

public class splitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    private static int balancedStringSplit(String s) {
        int balancedCount = 0; //to return the actual count of balanced splitted strings
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else if (s.charAt(i) == 'L') {
                count--;
            }

            if (count == 0) {
                balancedCount++;
            }
        }
        return balancedCount;
    }
}
