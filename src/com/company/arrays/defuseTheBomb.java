package com.company.arrays;

import java.util.Arrays;

public class defuseTheBomb {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        Arrays.stream(decrypt(code, k)).forEach(System.out::println);
    }

    private static int[] decrypt(int[] code, int k) {
        int[] circularArray = new int[code.length * 2];
        System.arraycopy(code,0, circularArray, 0, code.length);
        System.arraycopy(code, 0, circularArray, code.length, code.length);
        int x = 0;
        for (int i = 0; i < code.length; i++) {
            if ( k > 0) {
                int sum = 0;
                for (int z = 1; z <= k; z++ ) {
                    sum += circularArray[z+i];
                }
                code[x++] = sum;
            }
            else if ( k < 0) {
                int sum = 0;
                for (int z = k; z < 0; z++) {
                    sum += circularArray[i+ code.length + z];
                }
                code[x++] = sum;
            }
            else if ( k == 0) {
                code[x++] = 0;
            }
        }

        return code;
    }
}
