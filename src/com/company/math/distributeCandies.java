package com.company.math;

import java.util.Arrays;

public class distributeCandies {
    public static void main(String[] args) {
        int candies = 60;
        int numOfPeople = 4;
        Arrays.stream(distributeCandiesToPeople(candies, numOfPeople)).forEach(System.out::println);
    }

    private static int[] distributeCandiesToPeople(int candies, int numOfPeople) {
        int[] result = new int[numOfPeople];
        int i = 0;
        while (candies > 0) {
           result[i % numOfPeople] += Math.min(i + 1, candies);
           i++;
           candies -= i;
        }
        return result;
    }
}
