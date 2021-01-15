package com.company.hashTable;

import java.util.*;

public class keyboardRow {
    public static void main(String[] args) {
        String[] words = {"omk"};
        Arrays.stream(findWords(words)).forEach(System.out::println);
    }

    private static String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2= "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();
        int k = 0;

        for (String word : words) {
//            Map<Character, Integer> map = new HashMap<>();
//            for (int i = 0; i < word.toLowerCase().length(); i++) {
//                map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
//            }

            int x = 0, y = 0, z = 0;
            for (int i = 0; i < word.length(); i++) {
                char c = word.toLowerCase().charAt(i);
                if (!row2.contains(String.valueOf(c)) && !row3.contains(String.valueOf(c))) {
                    x++;
                } else if (!row1.contains(String.valueOf(c)) && !row3.contains(String.valueOf(c))) {
                    y++;
                } else if (!row1.contains(String.valueOf(c)) && !row2.contains(String.valueOf(c))) {
                    z++;
                }
            }
            if (x == word.length() || y == word.length() || z == word.length()) {
                result.add(word);
            }
        }
       return result.toArray(new String[result.size()]);

    }
}
