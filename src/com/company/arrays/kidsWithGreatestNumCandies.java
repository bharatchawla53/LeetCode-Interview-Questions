package com.company.arrays;

import java.util.ArrayList;
import java.util.List;

public class kidsWithGreatestNumCandies {
    public static void main(String[] args) {
        int[] candies = new int[]{2,3, 5, 1,3};
        int extraCandies = 3;
        kidsWithCandies(candies, extraCandies).forEach(System.out::println);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] < maxCandies) {
                if (candies[i] + extraCandies >= maxCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            } else if (candies[i] == maxCandies) {
                result.add(true);
            }
        }

        return result;
    }
}
