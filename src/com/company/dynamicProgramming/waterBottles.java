package com.company.dynamicProgramming;

public class waterBottles {
    public static void main(String[] args) {
        int numBottles = 86;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }

    private static int numWaterBottles(int numBottles, int numExchange) {
        int numWaterBottles = 0;

        numWaterBottles += numBottles;

        for (int i = 0; i <= numExchange; i++) {
            if (numBottles % numExchange == 0) {
                numBottles = numBottles / numExchange;
                numWaterBottles += numBottles;
            } else {
                int remainingBottles = numBottles % numExchange;
                numBottles -= remainingBottles;
                if (numBottles % numExchange == 0) {
                    numBottles = numBottles / numExchange;
                    numWaterBottles += numBottles;
                    numBottles += remainingBottles;
                }
            }
        }

        return numWaterBottles;
    }
}
