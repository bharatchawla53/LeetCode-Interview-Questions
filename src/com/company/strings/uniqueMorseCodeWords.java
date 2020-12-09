package com.company.strings;

import java.util.HashSet;
import java.util.Set;

public class uniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = new String[]{"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        System.out.println(uniqueMorse(words));
    }

    private static int uniqueMorse(String[] words) {
        StringBuilder sb = new StringBuilder();
        String[] results = new String[words.length];
        Set<String> hashSt = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int y = 0; y < word.length(); y++) {
                switch (word.charAt(y)) {
                    case 'a' : sb.append(".-"); break;
                    case 'b' : sb.append("-..."); break;
                    case 'c' : sb.append("-.-."); break;
                    case 'd' : sb.append("-.."); break;
                    case 'e' : sb.append("."); break;
                    case 'f' : sb.append("..-."); break;
                    case 'g' : sb.append("--."); break;
                    case 'h' : sb.append("...."); break;
                    case 'i' : sb.append(".."); break;
                    case 'j' : sb.append(".---"); break;
                    case 'k' : sb.append("-.-"); break;
                    case 'l' : sb.append(".-.."); break;
                    case 'm' : sb.append("--"); break;
                    case 'n' : sb.append("-."); break;
                    case 'o' : sb.append("---"); break;
                    case 'p' : sb.append(".--."); break;
                    case 'q' : sb.append("--.-"); break;
                    case 'r' : sb.append(".-."); break;
                    case 's' : sb.append("..."); break;
                    case 't' : sb.append("-"); break;
                    case 'u' : sb.append("..-"); break;
                    case 'v' : sb.append("...-"); break;
                    case 'w' : sb.append(".--"); break;
                    case 'x' : sb.append("-..-"); break;
                    case 'y' : sb.append("-.--"); break;
                    case 'z' : sb.append("--.."); break;
                }
            }
            results[i] = sb.toString();
            sb = sb.delete(0, sb.length());
        }

        for (int i = 0; i < results.length; i++) {
            hashSt.add(results[i]);
        }

        return hashSt.size();
    }
}
