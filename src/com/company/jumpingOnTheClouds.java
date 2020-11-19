package com.company;


public class jumpingOnTheClouds {
    public static void main(String[] args) {
        int[] nClouds = new int[]{0, 0, 1, 0, 0, 1, 0};
        jumpingOnClouds(nClouds);
        jumpingOnCloudsV2(nClouds);

    }

    private static void jumpingOnCloudsV2(int[] nClouds) {
        int count = 0;
        for (int i = 0; i < nClouds.length; i++, count++) {
            if (i+2 < nClouds.length && nClouds[i+2] == 0){
                i++;
            }
        }
        System.out.println(count-1);
    }

    private static void jumpingOnClouds(int[] nClouds) {
        int count = 0;
        for (int i = 0; i < nClouds.length; ) {
           /* if(nClouds[i] == 0) i++;
            count++;*/
            if (i+2 < nClouds.length && nClouds[i+2] == 0){
                i = i + 2;
            } else {
                i++;
            }
            count++;
        }
        System.out.println(count-1);
    }
}
