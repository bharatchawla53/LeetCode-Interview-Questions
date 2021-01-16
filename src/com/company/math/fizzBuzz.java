package com.company.math;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public static void main(String[] args) {
        int n = 15;
        fizzBuzzCall(n).forEach(System.out::println);
    }

    private static List<String> fizzBuzzCall(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
