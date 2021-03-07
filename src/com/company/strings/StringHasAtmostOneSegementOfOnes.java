package com.company.strings;

public class StringHasAtmostOneSegementOfOnes {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegement(s));
    }

    private static boolean checkOnesSegement(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                counter++;
                while (i+1 < s.length() && s.charAt(i+1) == '1') {
                    i++;
                }
            }
        }
        return counter == 1;
    }
}
