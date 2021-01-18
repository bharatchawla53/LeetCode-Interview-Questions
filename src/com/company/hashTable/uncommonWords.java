package com.company.hashTable;

import java.util.*;

public class uncommonWords {
    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        uncommonFromSentence(A, B);
    }

    private static String[] uncommonFromSentence(String A, String B) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        List<String> result = new ArrayList<>();

        for (String word : a) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for (String word : b) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for (Map.Entry<String, Integer> keyValue : map.entrySet()) {
            if (keyValue.getValue() == 1) {
                result.add(keyValue.getKey());
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
