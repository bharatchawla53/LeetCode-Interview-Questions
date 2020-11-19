package com.company;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestWordInDictionary {
    public static void main(String[] args) {
        String[] words = new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(longestWord(words));
    }

    private static String longestWord(String[] words) {
        String answer = "";
        Arrays.sort(words); //lexicographical order
        Set<String> set = new HashSet<String>();

        for (String word : words) {
            //substring to form a longest word check condition before adding to the set
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                if(word.length() > answer.length()) {
                    answer = word;
                }
            }
        }
        return answer;
    }


}
