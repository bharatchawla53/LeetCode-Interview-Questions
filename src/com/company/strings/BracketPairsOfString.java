package com.company.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class BracketPairsOfString {
    public static void main(String[] args) {
        String s = "(a)(b)";
        List<List<String>> knowledge = asList(asList("a","b"), asList("b", "a"));

        System.out.println(evaluate(s, knowledge));
    }

    private static String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        knowledge.forEach(sMap -> map.put(sMap.get(0), sMap.get(1)));

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = i;
                while (s.charAt(j) != ')') {
                    j++;
                }
                String key = s.substring(i+1, j);
                if (map.containsKey(key)) {
                    result.append(map.get(key));
                } else {
                    result.append("?");
                }
                i = j;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

}
