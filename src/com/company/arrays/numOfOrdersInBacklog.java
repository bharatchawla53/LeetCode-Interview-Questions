package com.company.arrays;

import java.util.*;

public class numOfOrdersInBacklog {
    public static void main(String[] args) {
        int[][] orders = {{10,5,0},{15,2,1},{25,1,1},{30,4,0}};
        System.out.println(getNumberOfBacklogOrders(orders));
    }

    private static int getNumberOfBacklogOrders(int[][] orders) {
        PriorityQueue<int[]> buy = new PriorityQueue<>((o1, o2) -> Integer.compare(o2[0], o1[0]));
        PriorityQueue<int[]> sell = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[0], o2[0]));
        long mod = 1000000007;

        for (int order = 0; order < orders.length; order++) {
            // determine whether order is a buy or sell
            if (orders[order][2] == 0){
                if (sell.isEmpty()) {
                    buy.add(orders[order]);
                } else {
                    while(!sell.isEmpty() && sell.peek()[0] <= orders[order][0] && orders[order][1] > 0){
                        int[] ord = sell.poll();
                        if (ord[1] <= orders[order][1]) {
                            orders[order][1] -= ord[1];
                        } else if (ord[1] > orders[order][1]){
                            ord[1] -= orders[order][1];
                            sell.add(ord);
                            orders[order][1]=0;
                        }
                    }
                    if (orders[order][1] > 0){
                        buy.add(orders[order]);
                    }
                }
            } else {
                if (buy.isEmpty()) {
                    sell.add(orders[order]);
                } else {
                    while(!buy.isEmpty() && buy.peek()[0] >= orders[order][0] && orders[order][1] > 0){
                        int[] ord = buy.poll();
                        if (ord[1] <= orders[order][1]) {
                            orders[order][1] -= ord[1];
                        } else if (ord[1] > orders[order][1]){
                            ord[1] -= orders[order][1];
                            buy.add(ord);
                            orders[order][1]=0;
                        }
                    }
                    if (orders[order][1] > 0){
                        sell.add(orders[order]);
                    }
                }
            }
        }

        int result = 0;
        while(!buy.isEmpty()){
            result += buy.poll()[1];
        }
        while(!sell.isEmpty()){
            result += sell.poll()[1];
        }
        return (int) (result % mod);
    }
}
