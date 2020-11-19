package com.company;

import java.util.ArrayList;
import java.util.List;

public class minimumSwaps {
    public static void main(String[] args) {
        int size = 4;
        int[] arr = new int[]{4,3,1,2};
        //minimumSwapsCount(size, arr);
        minimumSwapsCount2(size, arr);
    }

    //use graphs to sort the array
    private static void minimumSwapsCount2(int size, int[] arr) {
        //2,1,5,3,4
        //i = 0 in this case as an example
        //arr[i] == i ==> 2-1 == 0
        //

        //boolean array to identify visited nodes.
        boolean[] visited = new boolean[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(!visited[i]){ //if node not visited, need to create the cycle
                count += findCyclePaths(visited, i, arr).size() - 1;
            }
        }
        System.out.println(count);
    }

    private static List<Integer> findCyclePaths(boolean[] visited, int i, int[] arr) {
        List<Integer> nodes = new ArrayList<>();
        nodes.add(i);
        while(true) {
            visited[i] = true;
            int dest = arr[i] - 1;
            if (nodes.get(0) == dest) {
                break;
            }
            nodes.add(dest);
            i = dest;
        }
        return nodes;
    }

    private static void minimumSwapsCount(int size, int[] arr) {
        int count = 0;
        for (int i = 0; i < size; i++){
            int minValue = i;
            //iterate through the rest of the values in an array to find minimum if exists
            for (int j = i + 1; j < size; j++){
                if (arr[j] < arr[minValue]){
                    minValue = j;
                }
            }

            if (minValue != i) {
                count++;
                int temp = arr[i];
                arr[i] = arr[minValue];
                arr[minValue] = temp;

            }
        }
        System.out.println(count);
    }

}
