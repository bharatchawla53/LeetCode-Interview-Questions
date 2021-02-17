package com.company.strings;

public class customSortString {
    public static void main(String[] args) {
        String S = "hucw";
        String T = "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
        System.out.println(customString(S, T));
    }

    private static String customString(String S, String T) {
        int[] maxChars = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T.length(); i++) {
            maxChars[T.charAt(i) - 'a']++;
        }

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < maxChars[S.charAt(i) - 'a']; j++) {
                sb.append(S.charAt(i));
            }
            maxChars[S.charAt(i) - 'a'] = 0;
        }

        if (sb.length() < T.length()) {
            for (int i = 0; i < T.length(); i++) {
                if (!sb.toString().contains(String.valueOf(T.charAt(i)))) {
                    for (int j = 0; j < maxChars[T.charAt(i) - 'a']; j++) {
                        sb.append(T.charAt(i));
                    }
                }
            }
        }

        return sb.toString();
    }
}
