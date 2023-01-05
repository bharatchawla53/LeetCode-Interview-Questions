package com.company.arrays;

import java.util.*;

public class findingUsersActiveMins {
    public static void main(String[] args) {
        int[][] logs = {{3,50},{7,10},{12,25}};
        int k = 10;
        Arrays.stream(findingUsersActiveMinutes(logs, k)).forEach(System.out::println);
        calculateTax(logs, k);
    }

    private static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> userLogs = new HashMap<>();
        int[] answer = new int[k];

        for (int i = 0; i < logs.length; i++) {
            userLogs.putIfAbsent(logs[i][0], new HashSet<>());
            userLogs.get(logs[i][0]).add(logs[i][1]);
        }

        for (int user : userLogs.keySet()) {
            int uam = userLogs.get(user).size();
            answer[uam-1]++;
        }

        return answer;
    }

    private static double calculateTax(int[][] brackets, int income) {
        double taxOwed = 0.0;
        if (income == 0) {
            return taxOwed;
        }
        for (int i = 0; i < brackets.length; i++) {
            if (income != 0) {
                double upper = brackets[i][0];
                double percent = brackets[i][1];

                double prevUpper;
                if (i > 0) {
                    prevUpper = brackets[i-1][0];
                    upper = upper - prevUpper;
                }

                if (upper > income) {
                    upper = income;
                }

                double cal = upper * percent / 100;
                taxOwed += cal;
                income -= upper;
            }
        }

        return taxOwed;
    }

}
