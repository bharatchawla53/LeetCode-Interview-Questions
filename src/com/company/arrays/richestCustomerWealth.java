package com.company.arrays;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        System.out.println(maxWealth(accounts));
    }

    private static int maxWealth(int[][] accounts) {
        int result = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp =  0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp = temp + accounts[i][j];
            }
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
