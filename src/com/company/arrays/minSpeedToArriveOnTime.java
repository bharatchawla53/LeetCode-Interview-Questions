package com.company.arrays;

import java.util.Arrays;

public class minSpeedToArriveOnTime {
    public static void main(String[] args) {
        int[] dist = {1,3,2};
        double hour = 6;
        System.out.println(minSpeedOnTime(dist, hour));
    }

    private static int minSpeedOnTime(int[] dist, double hour) {
        if (hour < dist.length-1) {
            return -1;
        }
        //binary search
        int left = 0;
        int right = Arrays.stream(dist).max().getAsInt();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canArriveOnTime(dist, mid, hour)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static boolean canArriveOnTime(int[] dist, int mid, double hour) {
        double totalHrs = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            totalHrs += Math.ceil((double) dist[i] / mid);
        }
        totalHrs += (double) dist[dist.length-1] / mid;
        return totalHrs <= hour;
    }
}
