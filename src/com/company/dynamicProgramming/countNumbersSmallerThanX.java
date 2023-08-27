package com.company.dynamicProgramming;

public class countNumbersSmallerThanX {

    public static void main(String[] args) {
        int X = 100;
        int Y = 4;

        System.out.println(count(X, Y));
    }

    private static int count(int x, int y) {
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (sum(i) == y) {
                count++;
            }
        }

        return count;
    }

    private static int sum(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }


}
