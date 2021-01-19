package com.company.strings;

public class reverseOnlyLetters {
    public static void main(String[] args) {
        String S = "a-bC-dEf-ghIj";
        System.out.println(reverseString(S));
    }

    private static String reverseString(String S) {
        int start = 0;
        int end = S.length()-1;

        char[] chars = S.toCharArray();
        while (start < end) {
            if (Character.isLetter(chars[start]) && Character.isLetter(chars[end])) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
            }
            if ((chars[start] < 65 || chars[start] > 90) && (chars[start] < 97 || chars[start] > 122)){
                start++;
            } else if ((chars[end] < 65 || chars[end] > 90) && (chars[end] < 97 || chars[end] > 122)) {
                end--;
            } else {
                start++;
                end--;
            }
        }
        return new String(chars);
    }
}
