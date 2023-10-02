package com.company.strings;

public class winnerGame {
    public static void main(String[] args) {
        String colors = "AAAAABBB";
        System.out.println(winnerOfGame(colors));
    }

    public static boolean winnerOfGame(String colors) {
       int alice = 0, bob = 0;

       for (int i = 1; i < colors.length() - 1; i++) {
           if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
               if (colors.charAt(i) == 'A') {
                   alice++;
               } else {
                   bob++;
               }
           }
       }

       return alice - bob >= 1;
    }
}
