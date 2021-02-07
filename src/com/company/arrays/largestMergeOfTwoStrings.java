package com.company.arrays;

public class largestMergeOfTwoStrings {
    public static void main(String[] args) {
        String word1 = "nnnnpnnennenpnnnnneenpnn";
        String word2 = "nnnennnnnnpnnennnnennnnee";

        System.out.println(largestMerge(word1, word2));
    }

    private static String largestMerge(String word1, String word2) {

        if (word1 == null && word2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0, j =0;

        while (i < word1.length() && j < word2.length()) {
            if (word1.charAt(i) > word2.charAt(j)) {
                sb.append(word1.charAt(i++));
            } else if (word2.charAt(j) > word1.charAt(i)){
                 sb.append(word2.charAt(j++));
            } else {
                if(word1.substring(i).compareTo(word2.substring(j)) >= 0) {
                    sb.append(word1.charAt(i++));
                } else {
                    sb.append(word2.charAt(j++));
                }
            }
        }

        if ( i < word1.length()) {
            sb.append(word1.substring(i));
        }

        if ( j < word2.length()) {
            sb.append(word2.substring(j));
        }
        return sb.toString();

    }

}
