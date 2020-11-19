package com.company.strings;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "cbbcc";
        System.out.println(checkIsPalindrome(s));
        System.out.println(makeAPalindrome(s));
    }

    //valid palindrome leetcode
    private static boolean checkIsPalindrome(String s) {
        StringBuilder buffer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122 || c >= 48 && c <= 57){
                buffer.append(c);
            }
        }
        int start = 0;
        int end = buffer.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(buffer.charAt(start)) == Character.toLowerCase(buffer.charAt(end))) {
                start++;
                end--;
            } else {
                return  false;
            }
        }

        return true;
    }

    //valid Palindrome II leetcode
    private static boolean makeAPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPossiblePalindrome(s, start + 1, end) || isPossiblePalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }

        return true;
    }

    private static boolean isPossiblePalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
