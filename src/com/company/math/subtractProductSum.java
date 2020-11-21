package com.company.math;

import java.util.ArrayList;
import java.util.List;

public class subtractProductSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    private static int subtractProductAndSum(int n) {

        List<Integer> nums = new ArrayList<>();
        while (n > 0) {
            nums.add(n%10);
            n /= 10;
        }
        int prod = 1, sum = 0;
        for (int j = 0; j < nums.size(); j++) {
            prod *= nums.get(j);
            sum += nums.get(j);
        }

        return prod - sum;
        
    }
}
