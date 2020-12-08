package com.company.stack;

import java.util.*;

public class buildArrayWithStack {
    public static void main(String[] args) {
        int[] target = new int[]{1,2};
        int n = 1;
        buildArray(target, n).forEach(System.out::println);
    }

    private static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int val = 1;
        int i = 0;
        while(i < target.length){
            result.add("Push");
            if(target[i]==val){
                val++;
                i++;
            }else{
                val++;
                result.add("Pop");
            }
        }
        return result;
    }

}
