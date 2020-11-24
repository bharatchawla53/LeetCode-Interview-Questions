package com.company.math;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNumbers {
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        selfDividingNums(left, right).forEach(System.out::println);

    }

    private static List<Integer> selfDividingNums(int left, int right) {

        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if(isSelfDividing(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isSelfDividing(int i) {
        String s = Integer.toString(i);
        for(char c : s.toCharArray()) {
            if (c == '0' || i % (c - '0') != 0) {
                return false;
            }
        }
        return true;
    }
}

