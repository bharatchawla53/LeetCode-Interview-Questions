package com.company.strings;

import java.util.Arrays;
import java.util.List;

public class wordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        System.out.println(segmentedWords(s, wordDict));
    }

    private static boolean segmentedWords(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        int maxLength = 0;

        for (String word : wordDict) {
            maxLength = Math.max(word.length(), maxLength);
        }

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (i - j <= maxLength) {
                    continue;
                }

                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
