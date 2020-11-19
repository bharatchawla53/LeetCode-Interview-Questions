package com.company.trees;

public class binarySearch {
    public static void main(String[] args) {
        int[] sortedArr = new int[]{-2,3,4,7,8,11,13};
        int[] rotatedArr = new int[]{4,7,8,11,13, -2, 3};
        int targetValue = 11;
        System.out.println("Sorted Array: " + searchTreeWithSortedArray(rotatedArr, targetValue));
    }

    private static int searchTreeWithSortedArray(int[] arr, int targetValue) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == targetValue) {
                return mid;
            }
            else if (targetValue < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
