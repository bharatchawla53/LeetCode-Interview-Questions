package com.company.strings;

public class detectCapital {
    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(detectCapitalUse(word));
    }

    private static boolean detectCapitalUse(String word) {
        if (word == null) return false;

        if (isAllUpper(word) || isAllLower(word) || ((word.charAt(0) >= 65 || word.charAt(0) <= 90) && isFirstUpper(word))) return true;
        return false;
    }

    private static boolean isFirstUpper(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 97 || word.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }

    private static boolean isAllLower(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 97 || word.charAt(i) > 122){
                return false;
            }
        }
        return true;
    }

    private static boolean isAllUpper(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 65 || word.charAt(i) > 90){
                return false;
            }
        }
        return true;
    }
}
