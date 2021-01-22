package com.company.hashTable;

import java.util.HashMap;

public class shortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks","pest","stew","show"};
        System.out.println(shortestCompletingPath(licensePlate, words));
    }

    private static String shortestCompletingPath(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        String solution = "";
        int length = Integer.MAX_VALUE;

        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                map.put(licensePlate.toLowerCase().charAt(i), map.getOrDefault(licensePlate.toLowerCase().charAt(i), 0) + 1);
            }
        }

        for (String word : words) {
            if (word.length() >= length) {
                continue;
            }
            if (canBuild(map, word)) {
                solution = word;
                length = word.length();
            }

        }
        return solution;
    }

    private static boolean canBuild(HashMap<Character, Integer> map, String word) {
        HashMap<Character, Integer> check = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            check.put(word.charAt(i), check.getOrDefault(word.charAt(i), 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.getOrDefault(c,0) > check.getOrDefault(c, 0)) {
                return false;
            }
        }
        return true;
    }
}
