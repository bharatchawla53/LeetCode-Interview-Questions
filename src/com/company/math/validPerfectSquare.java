package com.company.math;

public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPerfectSqaure(num));
    }

    private static boolean isPerfectSqaure(int num) {
        if (num == 1) return true;
        long low = 1, high = num /2 ;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
        return false;
    }
}
