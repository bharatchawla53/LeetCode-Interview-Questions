package com.company.strings;

public class countNumOfHomogenousSubStrings {
    public static void main(String[] args) {
        String s = "yyyyyyyyvvvvvvvvvvv";
        System.out.println(countHomogenous(s));
    }

    private static int countHomogenous(String s) {
        long result = 0, count = 1;
        long mod=1000000007;

        // num of substrings
        // n*(n+1) / 2

        //traverse the string
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(i+1);

                if (c1 == c2) {
                    count++; //to find the same characters length
                } else { //found the index where the character is different
                    result += count * (count + 1) / 2; //to find the number of substring of same characters
                    result = result % mod;
                    count = 1;
                }
            }
        }
        result += count * (count + 1) / 2;
        result = result % mod;


        return (int) result;
    }
}
