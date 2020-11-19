package com.company.arrays;


import java.util.Arrays;

public class leftRotation {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int d = 4;
        rotLeft(a, d);
        rotLeft2(a, d);
    }

    //1,2,3,4,5 ---> 2,3,4,5,1-->3,4,5,1,2 -->4,5,1,2,3 -->5,1,2,3,4
    //resolve time complexity issue ??????
    //5 % 4 = 1 (shift of 1)
    //5 % 6 =
    private static void rotLeft(int[] a, int d) {
        for (int i = 0; i < d; i++){
            int temp = a[0];
            for (int j = 0; j < a.length; j++) {
                if (j+1 < a.length ) {
                    a[j] = a[j+1];
                } else {
                    a[j] = temp;
                }
            }
        }
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void rotLeft2(int[] a, int d){
        int[] rotArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int newI = (i + a.length - d) % a.length;
            rotArr[newI] = a[i];
        }
        Arrays.stream(rotArr).forEach(System.out::println);
    }

}
