package com.company.dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frogJump {
    public static void main(String[] args) {
        int[] n = new int[]{0, 1, 3, 5, 6, 8, 12, 17};
        System.out.println(canJump(n));
    }

    private static boolean canJump(int[] stones) {
        Map<Integer, Integer> map = new HashMap<>();
        // index, prevJump
        boolean[][] dp = new boolean[2001][2001];

        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], i);
        }

        dp[0][0] = true;

        for (int i = 0; i < stones.length; i++) {
            for (int k = 0; k < stones.length; k++) {
                if (dp[i][k]) {
                    // k-1
                    if (map.containsKey(stones[i] + k - 1)) {
                        dp[map.get(stones[i] + k - 1)][k - 1] = true;
                    }
                    // k
                    if (map.containsKey(stones[i] + k )) {
                        dp[map.get(stones[i] + k)][k] = true;
                    }
                    // k - 1
                    if (map.containsKey(stones[i] + k + 1)) {
                        dp[map.get(stones[i] + k + 1)][k + 1] = true;
                    }
                }
            }
        }

        for (int i = 0; i < stones.length; i++) {
            if (dp[stones.length - 1][i]) {
                return true;
            }
        }

        return false;
    }

/*    private static boolean canJump(int[] stones) {
        Map<Integer, Integer> map = new HashMap<>();
        int[][] dp = new int[2001][2001];

        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], i);
        }

        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(map, dp, stones, 0, 0);
    }

    private static boolean solve(Map<Integer, Integer> map, int[][] dp, int[] stones, int index, int k) {

        if (index == map.size() - 1) {
            return true;
        }

        if (dp[index][k] != -1) {
            return dp[index][k] == 1;
        }

        // k-1, k, k+1
        boolean ans = false;
        for (int i = k - 1; i <= k + 1; i++) {
            if (i > 0 && map.containsKey(stones[index] + i)) {
                ans = ans || solve(map, dp, stones, map.get(stones[index] + i), i);
            }
        }

        dp[index][k] = ans ? 1 : 0;
        return ans;
    }*/


}
