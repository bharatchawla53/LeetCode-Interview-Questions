package com.company.strings;

public class numOfSubstringsWith1s {
    public static void main(String[] args) {
        String s = "00";
        System.out.println(numSub(s));
    }

    private static int numSub(String s) {
        long result = 0, count = 0;
        long mod = 1000000007;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                count++;
            } else {
                result += count * (count + 1) / 2;
                result = result % mod;
                count = 0;
            }
        }

        result += count * (count + 1) / 2;
        result = result % mod;
        return (int) result;
    }
}
