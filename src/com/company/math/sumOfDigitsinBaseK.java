package com.company.math;

public class sumOfDigitsinBaseK {
    public static void main(String[] args) {
        int n = 34;
        int k = 6;
        System.out.println(sumBase(n, k));
    }

    private static int sumBase(int n, int k) {
        String s = Integer.toString(n, k);
        int baseK = Integer.parseInt(s);
        int sum = 0;
        while (baseK > 0) {
            int temp = baseK % 10;
            sum += temp;
            baseK = baseK / 10;
        }

        return sum;
    }
}
