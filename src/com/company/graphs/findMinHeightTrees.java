package com.company.graphs;

import java.util.*;

public class findMinHeightTrees {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
        findMinHeight(n, edges);
    }

    private static List<Integer> findMinHeight(int n, int[][] edges) {

        if (n < 2) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
            return result;
        }

        // adjacency List
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new HashSet<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        // queue to hold leaf nodes
        Queue<Integer> leaves = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (adjList.get(i).size() == 1) {
                leaves.offer(i);
            }
        }

        // trim leaves until 2 leaves nodes are left aka finding centroids
        int remainingNodes = n;

        while (remainingNodes > 2) {
            int size = leaves.size();
            remainingNodes -= size;

            Queue<Integer> newLeaves = new LinkedList<>();

           for (int i = 0; i < size; i++) {
               int item = leaves.poll();

               for (int connection : adjList.get(item)) {
                   adjList.get(connection).remove(item);
                   if (adjList.get(connection).size() == 1) {
                       newLeaves.offer(connection);
                   }
               }
           }

           leaves = newLeaves;
        }

        return leaves.stream().toList();
    }
}
