package com.company.strings;

public class mergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(merge(word1, word2));

    }

    private static String merge(String word1, String word2) {
        int index1 = 0;
        int index2 = 0;
        StringBuilder sb = new StringBuilder();
        while (index1 < word1.length() || index2 < word2.length()) {
            if (index1 < word1.length()) {
                sb.append(word1.charAt(index1));
                index1++;
            }
            if (index2 < word2.length()) {
                sb.append(word2.charAt(index2));
                index2++;
            }

            if (index1 > word1.length() && index2 < word2.length()) {
                sb.append(word2.charAt(index2));
                index2++;
            }
            if (index1 < word1.length() && index2 > word2.length()) {
                sb.append(word1.charAt(index1));
                index1++;
            }

        }
        return sb.toString();
    }
}
