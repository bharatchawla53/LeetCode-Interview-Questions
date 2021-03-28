package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class numOfDiffIntinString {
    public static void main(String[] args) {
        String word = "leet1234code234";
        System.out.println(numDifferentIntegers(word));
    }

    private static int numDifferentIntegers(String word) {

        Set<String> result = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        if (word.chars().allMatch(Character::isDigit)) {
            return 1;
        }

        for (char ch : word.toCharArray()) {
            if (!Character.isDigit(ch)){
                sb.append(" ");
            } else {
                sb.append(ch);
            }
        }

        StringBuilder sb2 = new StringBuilder();
        for (char ch : sb.toString().toCharArray()) {
            if (ch != ' ') {
                sb2.append(ch);
            } else {
                if (!sb2.toString().isEmpty()) {
                    if (sb2.toString().startsWith("0")) {
                        int counter = 0;
                        for (char c : sb2.toString().toCharArray()){
                            if (c == '0'){
                                counter++;
                            } else {
                                break;
                            }
                        }
                        String temp = sb2.toString().substring(counter);
                        result.add(temp);
                    } else {
                        result.add(sb2.toString());
                    }
                    sb2 = new StringBuilder();
                }

            }
        }

        if (!sb2.toString().isEmpty()) {
            if (sb2.toString().startsWith("0")) {
                int counter = 0;
                for (char c : sb2.toString().toCharArray()) {
                    if (c == '0') {
                        counter++;
                    } else {
                        break;
                    }
                }
                String temp = sb2.toString().substring(counter);
                result.add(temp);
            }else {
                result.add(sb2.toString());
            }
        }
        return result.size();
    }
}
