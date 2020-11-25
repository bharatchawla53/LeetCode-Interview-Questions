package com.company.strings;

public class ifTwoStringArraysAreEqual {
    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        for (String word : word1) {
            string1.append(word);
        }
        for (String word : word2) {
            string2.append(word);
        }

        return string1.toString().equals(string2.toString());
    }
}
