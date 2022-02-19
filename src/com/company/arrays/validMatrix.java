package com.company.arrays;

import java.util.HashSet;
import java.util.Set;

public class validMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,2},{3,1,2},{2,3,1}};
        System.out.println(checkValid(matrix));
    }

    private static boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        Set<Integer> rowSet = new HashSet();
        Set<Integer> colSet = new HashSet();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSet.add(matrix[i][j]);
                colSet.add(matrix[j][i]);
            }
            if (rowSet.size() < n || colSet.size() < n)
                return false;
            rowSet.clear();
            colSet.clear();
        }
        return true;
    }
}
