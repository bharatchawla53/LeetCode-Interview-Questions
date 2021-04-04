package com.company.arrays;

import java.util.*;

public class findingUsersActiveMins {
    public static void main(String[] args) {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        Arrays.stream(findingUsersActiveMinutes(logs, k)).forEach(System.out::println);
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
}
