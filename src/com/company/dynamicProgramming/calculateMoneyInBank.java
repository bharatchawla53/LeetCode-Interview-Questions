package com.company.dynamicProgramming;

public class calculateMoneyInBank {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(totalMoney(n));
    }

    private static int totalMoney(int n) {
        int totalMoney = 0;

        if (n == 0 || n < 0) {
            return totalMoney;
        }

        int prevWeekMondayValue = 1;
        totalMoney += 1;

        if ( n < 2) {
            return totalMoney;
        }

        int curr = 1;
        int weekDecider = 1;

        for (int i = 2; i <= n; i++) {

            if (weekDecider % 7 == 0) {
                prevWeekMondayValue += 1;
                totalMoney += prevWeekMondayValue;
                curr = prevWeekMondayValue;
                //totalMoney +=  curr + 1;
            } else {
                totalMoney +=  curr + 1;
                curr += 1;

            }
            weekDecider++;
        }
        return totalMoney;
    }
}
