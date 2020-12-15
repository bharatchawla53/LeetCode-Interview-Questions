package com.company.strings;

import java.util.Arrays;
import java.util.HashMap;

public class permutationString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        System.out.println(checkInclusionUsingHashMap(s1, s2));
        System.out.println(checkInclusionUsingArray(s1, s2));
    }

    private static boolean checkInclusionUsingArray(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        if (s1.equals(s2)) return true;

        int[] s1Freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
        }

        int[] s2Freq = new int[26];
        int subStringLength = s1.length();
        String copyS2 = s2;
        String temp = "";
        for (int i = 0; i < s2.length(); i++) {
            if (copyS2.length() >= s1.length()) {
                temp = copyS2.substring(0, subStringLength);
            }
            //fill s2Map with temp string
            for (int j = 0; j < temp.length(); j++) {
                s2Freq[temp.charAt(j)-'a']++;
            }

            //check if s1map frequency is equal to s2map
            if (checkArray(s1Freq, s2Freq)) {
                return true;
            } else {
                Arrays.fill(s2Freq, 0);
                copyS2 = copyS2.substring(1);
                //subStringLength++;
            }
        }

        return false;
    }

    private static boolean checkArray(int[] s1Freq, int[] s2Freq) {
        for (int i = 0; i < 26; i++) {
            if(s1Freq[i] != s2Freq[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkInclusionUsingHashMap(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        if (s1.equals(s2)) return true;

        // create a hashmap to get the frequency of each char
        HashMap<Character, Integer> s1Map = new HashMap<>();
        fillHashMap(s1, s1Map);

        HashMap<Character, Integer> s2Map = new HashMap<>();
        int subStringLength = s1.length();
        String copyS2 = s2;
        String temp = "";
        for (int i = 0; i < s2.length(); i++) {
            if (copyS2.length() >= s1.length()) {
                temp = copyS2.substring(0, subStringLength);
            }
            //fill s2Map with temp string
            fillHashMap(temp, s2Map);

            //check if s1map frequency is equal to s2map
            if (checkMap(s1Map, s2Map)) {
                return true;
            } else {
                s2Map.clear();
                copyS2 = copyS2.substring(1);
                //subStringLength++;
            }
        }
        return false;
    }

    private static boolean checkMap(HashMap<Character, Integer> s1Map, HashMap<Character, Integer> s2Map) {
        if (s1Map.equals(s2Map)) {
            return true;
        }
        return false;
    }

    private static void fillHashMap(String s, HashMap<Character, Integer> s1Map) {
        for (int i = 0; i < s.length(); i++) {
            s1Map.put(s.charAt(i), s1Map.getOrDefault(s.charAt(i), 0) + 1);
        }
    }
}
