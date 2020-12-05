package com.company.dynamicProgramming;


public class divisorGame {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(divisor(n));
    }

    private static boolean divisor(int N) {

        //You only need to check if the number is odd or even as it is no where said that the number cannot be
        // reused and every time you use x as 1, you will see that the one who plays 1st wins.
        // As Alica is the one who plays the first step she always wins when its even adn loses when its odd.
        return N%2 == 0;
    }

}
