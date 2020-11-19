package com.company.arrays;

public class countNegativeNumbersInGrid {
    public static void main(String[] args) {
        int[][] grid = {{1,-1}, {-1,-1}};
        System.out.println(countNegatives(grid));
    }

    private static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}
