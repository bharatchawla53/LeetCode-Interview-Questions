package com.company.sort;

public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }

    private static String restoreString(String s, int[] indices) {
        /*

        s = "codeleet"
        int[] = [4,5,6,7,0,2,1,3]

        4 5 6 7 0 2 1 3
        c o d e l e e t

        0 1 2 3 4 5 6 7
        l e e t c o d e

         */

        char[] temp = new char[indices.length]; // new temp array based on indices length
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] =  s.charAt(i);
        }
        return new String(temp);
    }
}
