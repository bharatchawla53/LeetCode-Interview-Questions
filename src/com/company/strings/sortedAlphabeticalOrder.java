package com.company.strings;

public class sortedAlphabeticalOrder {
    public static void main(String[] args) {
        String s = "abc";
        String s1 = "asd";

        System.out.println(isSorted(s));
        System.out.print(isSorted(s1));
    }

    private static int isSorted(String s) {

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i == 0) {
                temp += c;
            } else {
                char sortedC = temp.charAt(i - 1);

                if (c - 'a' > sortedC - 'a') {
                    temp += c;
                } else {
                    return i;
                }
            }
        }

        return 0;
    }

}
