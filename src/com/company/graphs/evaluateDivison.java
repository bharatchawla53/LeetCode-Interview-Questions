package com.company.graphs;

import java.util.*;

public class evaluateDivison {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] result = new double[queries.size()];
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);

        for (int i = 0; i < queries.size(); i++) {
            // get the pair
            List<String> pair = queries.get(i);
            String src = pair.get(0);
            String target = pair.get(1);

            // run dfs or bfs to find the path
            result[i] = dfs(src, target, new HashSet<>(), graph);
        }

        return result;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        // adjacency list
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            // get the pair
            List<String> pair = equations.get(i);

            // add directed path
            graph.putIfAbsent(pair.get(0), new HashMap<>());
            graph.get(pair.get(0)).put(pair.get(1), values[i]);

            // also add inverse path
            graph.putIfAbsent(pair.get(1), new HashMap<>());
            graph.get(pair.get(1)).put(pair.get(0), 1 / values[i]);
        }

        return graph;
    }

    private double dfs(String src, String target, Set<String> visited, Map<String, Map<String, Double>> graph) {
        // check if it exists in graph first
        if (!graph.containsKey(src) || !graph.containsKey(target)) {
            return -1.0;
        }

        if (src.equals(target)) {
            return 1.0;
        }

        visited.add(src);

        for (Map.Entry<String, Double> nbr : graph.get(src).entrySet()) {
            if (!visited.contains(nbr.getKey())) {
                double weight = dfs(nbr.getKey(), target, visited, graph);

                if (weight != -1.0) {
                    return nbr.getValue() * weight;
                }
            }
        }

        return -1.0;
    }
}
