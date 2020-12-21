package com.company.trees;

import java.util.Arrays;

public class implementSegementTree {
    //array to store segment tree nodes
    int[] st;

    //constructor to construct segment tree (array) from given array
    public implementSegementTree(int[] arr, int n) {
        //height of segment tree
        int h = (int) Math.ceil(Math.log(n) / Math.log(2));

        //max size of segment tree
        int maxSize = 2 * (int) Math.pow(2,h) - 1;
        st = new int[maxSize];
        buildTree(arr, st,0, n-1, 0);

        System.out.println("Segement Tree array values: ");
        Arrays.stream(st).forEach(System.out::println);

        int sum = getSum(0, n-1,1, 13, 0);
        System.out.println("Sum: " + sum);
    }

    //recursive function that constructs segment tree
    private void buildTree(int[] arr, int[] st, int start, int end, int treeNode) {
        if (start == end) {
            st[treeNode] = arr[start];
            return;
        }

        int mid = (start+end) / 2;
        buildTree(arr, st, start, mid, 2*treeNode+1);
        buildTree(arr, st, mid+1, end, 2*treeNode+2);
        st[treeNode] = st[2*treeNode+1] + st[2*treeNode+2];
    }

    //return sum of elements in range from index start to end.
    private int getSum(int start, int end, int startQueryRange, int endQueryRange, int treeNode) {
        if (startQueryRange <= start && endQueryRange >= end) {
            return st[treeNode];
        }
        if (end < startQueryRange || start > endQueryRange) {
            return 0;
        }
        int mid = (start+end)/2;
        return getSum(start, mid, startQueryRange, endQueryRange, 2*treeNode+1) + getSum(mid+1, end, startQueryRange, endQueryRange, 2*treeNode+2);
    }

    //Driver code
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int n = arr.length;
        implementSegementTree segementTree = new implementSegementTree(arr, n);
    }

}

