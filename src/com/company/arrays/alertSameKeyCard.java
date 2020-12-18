package com.company.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class alertSameKeyCard {
    public static void main(String[] args) {
        String[] keyName = new String[]{"leslie","leslie","leslie","clare","clare","clare","clare"};
        String[] keyTime = new String[]{"13:00","13:20","14:00","18:00","18:51","19:30","19:49"};
        alertNames(keyName, keyTime).forEach(System.out::println);
    }

    private static List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        //populate the hashMap
        for (int i = 0; i < keyName.length; i++) {
            if (!map.containsKey(keyName[i])) {
                map.put(keyName[i], new ArrayList<>());
            }
            map.get(keyName[i]).add(convertToMins(keyTime[i]));
        }

        //iterate through hashMap for alert
        map.forEach((key, value) -> {
            if (value.size() > 2) {
                Collections.sort(value);
                for (int i = 2; i < value.size(); i++) {
                    if (value.get(i) - value.get(i-2) <= 60) {
                        result.add(key);
                        break;
                    }
                }
            }
        });
        Collections.sort(result);
        return result;
    }

    private static Integer convertToMins(String s) {
        String[] time = s.split(":");
        int hour = Integer.parseInt(time[0]) * 60;
        int mins = Integer.parseInt(time[1]);
        return hour + mins;
    }
}
