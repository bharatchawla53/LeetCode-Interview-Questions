package com.company.arrays;

public class minimumBribes {
    public static void main(String[] args) {
        int len = 5;
        int[] a = new int[]{2, 1, 5, 3, 4};
        minimumBribesCount(len, a);
    }

    private static void minimumBribesCount(int len, int[] a) {
        //initial state 1,2,3,4,5
        //final state 2,1,5,3,4 -- for current passed array [a].
        int counter = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != i + 1) {
                if (a[i-1] == i + 1) { //only 1 bribe happened
                    counter++;
                    swap(a, i, i-1);
                } else if (a[i-2] == i + 1) { //only 2 bribes happened
                    counter += 2;
                    swap(a, i -2, i -1);
                    swap(a, i - 1, i);
                } else { //more than 2 bribes happened
                    System.out.println("Too Chaotic");
                }
            }
        }
        System.out.println(counter);
    }

    private static void swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}
