package com.company.hashTable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class sockMerchant {
    public static void main(String[] args) {

        int n = 7;
        int[] socksPile = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        sockMerchant(n, socksPile);
    }

    private static void sockMerchant(int nSocks, int[] socksPile) {
        Set<Integer> hashSet = new HashSet<>();
        AtomicInteger pairs = new AtomicInteger();

        Arrays.stream(socksPile).forEach(value -> {
            if (!hashSet.contains(value)) {
                hashSet.add(value);
            } else {
                pairs.getAndIncrement();
                hashSet.remove(value);
            }
        });
        System.out.println(pairs);
    }
}
