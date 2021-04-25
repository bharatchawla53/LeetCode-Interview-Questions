package com.company.strings;

public class longestSubStringOfAllVowelsInOrder {
    public static void main(String[] args) {
        String word = "aeeiioauuaeiou";
        System.out.println(longestBeautifulSubstring(word));
    }

    private static int longestBeautifulSubstring(String word) {
        int max = 0;
        int vowels = 1; //starting word loop at index 1
        int subString = 1; //starting word loop at index 1
        // a < e < i < o < u
        for (int i = 1; i < word.length(); i++) {
            // keep incrementing substring count value even if current and previous chars are same to
            //find the longest substring.
            subString++;
            if (word.charAt(i) < word.charAt(i-1)) {
                vowels = 0;
                subString = 1;
            }

            if (word.charAt(i) != word.charAt(i-1)) {
                vowels++;
            }

            if (vowels == 5) {
                max = Math.max(max, subString);
            }

        }
        return max;
    }
}
