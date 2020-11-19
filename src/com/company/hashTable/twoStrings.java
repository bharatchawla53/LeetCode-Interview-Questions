package com.company.hashTable;

import java.util.HashMap;
import java.util.Map;

public class twoStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        twoStringsCommonSubString(s1, s2);
    }

    private static String twoStringsCommonSubString(String s1, String s2) {
        Map<Character, Integer> subStringMap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (subStringMap.containsKey(s1.charAt(i))) {
                subStringMap.put(s1.charAt(i), subStringMap.get(s1.charAt(i)) + 1);
            } else {
                subStringMap.put(s1.charAt(i), 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (subStringMap.containsKey(s2.charAt(i))){
                counter++;
                break;
            }
        }
        return (counter > 0 ? "Yes" : "No");
    }
}
