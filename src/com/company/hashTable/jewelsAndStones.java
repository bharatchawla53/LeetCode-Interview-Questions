package com.company.hashTable;

import java.util.HashSet;
import java.util.Set;

public class jewelsAndStones {
    public static void main(String[] args) {
        String j = "z";
        String s = "ZZ";
        System.out.println(numJewelsInStones(j, s));
    }

    private static int numJewelsInStones(String J, String S) {
        int stoneJewelsCounter = 0;
        Set<Character> jewelsSet = new HashSet<>();

        for (int i = 0; i < J.length(); i++) {
            jewelsSet.add(J.charAt(i));
        }

        for (int i = 0; i < S.length(); i++) {
            if (jewelsSet.contains(S.charAt(i))) {
                stoneJewelsCounter++;
            }
        }

        return stoneJewelsCounter;
    }
}
