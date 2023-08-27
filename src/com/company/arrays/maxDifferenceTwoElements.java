package com.company.arrays;

public class maxDifferenceTwoElements {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 4, 9, 5, 3, 7};
        int[] a2 = new int[]{2, 3, 10, 6, 4, 8, 1};
        int[] a3 = new int[]{4, 3, 1};

        System.out.println(maxDifference(a1, a1.length));
        System.out.println(maxDifference(a2, a2.length));
        System.out.println(maxDifference(a3, a3.length));
    }

    private static int maxDifference(int[] a, int n) {
        int max = Integer.MIN_VALUE; // max difference b/w largest and smallest
        int min = a[0]; // track the min value saw while iterating the array

        /*for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    max = Math.max(max, a[j] - a[i]);
                }
            }
        }   */

        for (int i = 1; i < n; i++) {

            if (a[i] > min) {
                max = Math.max(max, a[i] - min);
            } else {
                min = Math.min(min, a[i]);
            }
        }


        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
