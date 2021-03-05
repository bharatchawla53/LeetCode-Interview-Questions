package com.company.strings;

public class reverseWordsInString {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] split = s.split(" ");

        for (int i = split.length-1; i >= 0; i--) {
            if (!split[i].equals("")){
                sb.append(split[i]);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
