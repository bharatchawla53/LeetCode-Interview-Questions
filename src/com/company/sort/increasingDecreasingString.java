package com.company.sort;

public class increasingDecreasingString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc"; //"cdelotee"
        System.out.println(sortString(s));
    }

    private static String sortString(String s) {
        StringBuilder sb = new StringBuilder();

        int[] frequency = new int[26];

        //build the frequency array for the given string
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        //loop through until result string length is same as input string
        while (sb.length() < s.length()) {
            // step 1, 2
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != 0) {
                    frequency[i]--;
                    sb.append((char)(i + 'a'));
                }
            }

            // step 4, 5
            for (int i = frequency.length - 1; i >= 0; i-- ){
                if (frequency[i] != 0) {
                    frequency[i]--;
                    sb.append((char)(i + 'a'));
                }
            }
        }

        return sb.toString();
    }
}
