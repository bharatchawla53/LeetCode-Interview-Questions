package com.company.hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortArrayByIncreasingFreq {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        Arrays.stream(freqSort(nums)).forEach(System.out::print);
    }

    private static int[] freqSort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Map<Integer, Integer> collect = map.entrySet()
                .stream()
                .sorted((o1, o2) ->
                        o1.getValue().equals(o2.getValue()) ?
                                Integer.compare(o2.getKey(), o1.getKey()) :
                                Integer.compare(o1.getValue(), o2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer, LinkedHashMap::new));

        int x = 0;
        for (Map.Entry<Integer, Integer> key : collect.entrySet()){
            for (int i = 0; i < key.getValue(); i++) {
                nums[x++] = key.getKey();
            }
        }
        return nums;

    }
}
