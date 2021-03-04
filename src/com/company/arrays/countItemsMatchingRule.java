package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(Arrays.asList("phone", "blue", "pixel")));
        items.add(new ArrayList<>(Arrays.asList("computer","silver","lenovo")));
        items.add(new ArrayList<>(Arrays.asList("phone","gold","iphone")));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;

        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (item.get(0).equals(ruleValue)) {
                    matches++;
                }
            } else if (ruleKey.equals("color")){
                if (item.get(1).equals(ruleValue)) {
                    matches++;
                }
            } else if (ruleKey.equals("name")) {
                if (item.get(2).equals(ruleValue)) {
                    matches++;
                }
            }
        }
        return matches;
    }
}
