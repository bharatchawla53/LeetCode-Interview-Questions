package com.company.backTracking;

import java.util.ArrayList;
import java.util.List;

public class combinations {
    public static void main(String[] args) {
        int n = 13;
        int k = 13;
        combine(n, k).forEach(System.out::println);
    }

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> set = new ArrayList<>();

        backTracking(result, n, k, set, 1);

        return new ArrayList<>(result);
    }

    private static void backTracking(List<List<Integer>> result, int n, int k, List<Integer> set, int start) {
        if (set.size() == k) {
            result.add(new ArrayList<>(set));
            return;
        }

        for (int i= start; i <= n; i++) {
            set.add(i);
            backTracking(result, n, k, set, i+1);
            set.remove(set.size()-1);
        }

    }
}
