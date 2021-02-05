package com.company.strings;

public class countNumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for (String word : words) {
            if (charPresent(allowed, word)){
                counter++;
            }
        }
        return counter;
    }

    private static boolean charPresent(String allowed, String word) {
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (!allowed.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
