package com.company.graphs;

import java.util.*;

public class currencyExchange {

    static double rate = -1.0;
    public static void main(String[] args) {
        List<List<String>> currency = new ArrayList<>();
        currency.add(List.of("USD", "GBP"));
        currency.add(List.of("USD", "JPY"));
        currency.add(List.of("GBP", "JPY"));
        currency.add(List.of("CAD", "CNY"));
        currency.add(List.of("CAD", "KRW"));

        List<Double> rates = new ArrayList<>();
        rates.add(0.7);
        rates.add(109.0);
        rates.add(155.0);
        rates.add(5.27);
        rates.add(921.0);

        String src = "USD";
        String target = "CNY";

        System.out.println(maxAmountOfExchange(currency, rates, src, target));
    }

    private static double maxAmountOfExchange(List<List<String>> currency, List<Double> rates, String src, String target) {
        Map<String, Map<String, Double>> graph = buildGraph(currency, rates);

        dfs(graph, src, target, new HashSet<>(), 1.0);

        return rate;
    }

    private static void dfs(Map<String, Map<String, Double>> graph, String src, String target, Set<String> visited, double exchange) {
        if (!graph.containsKey(src) || !graph.containsKey(target)) {
            return;
        }

        if (src.equals(target)) {
            rate = Math.max(rate, exchange);
            return;
        }

        visited.add(src);

        for (Map.Entry<String, Double> nbr : graph.get(src).entrySet()) {
            if (!visited.contains(nbr.getKey())) {
                dfs(graph, nbr.getKey(), target, visited, nbr.getValue() * exchange);
            }
        }

    }

    private static Map<String, Map<String, Double>> buildGraph(List<List<String>> currency, List<Double> rates) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < currency.size(); i++) {
            List<String> pair = currency.get(i);

            // directed path
            graph.putIfAbsent(pair.get(0), new HashMap<>());
            graph.get(pair.get(0)).put(pair.get(1), rates.get(i));

            // inverse path
            graph.putIfAbsent(pair.get(1), new HashMap<>());
            graph.get(pair.get(1)).put(pair.get(0), 1 / rates.get(i));
        }

        return graph;
    }
}
