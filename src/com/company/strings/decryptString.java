package com.company.strings;

import java.util.HashMap;

public class decryptString {
    public static void main(String[] args) {
        String s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(freqAlphabets(s));
    }

    private static String freqAlphabets(String s) {
        HashMap<String, Character> map = new HashMap<>();
        String result = "";

        int k = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch < 'j')
                map.put(String.valueOf(k++), ch);
            else
                map.put(String.valueOf(k++)+"#", ch);
        }

        int i = 0;
        while (s != null) {
            if (i + 2 < s.length() && s.charAt(i+2) == '#') {
                String temp = Character.toString(s.charAt(i));
                temp = temp.concat(Character.toString(s.charAt(i+1))).concat(Character.toString(s.charAt(i+2)));
                result = result.concat(Character.toString(map.get(temp)));
                s = s.substring(i+3);

            } else {
                result = result.concat(Character.toString(map.get(Character.toString(s.charAt(i)))));
                s = s.substring(i+1);
            }

            if (s.equals("")) {
                s = null;
            }
            i = 0;
        }
        return result;
    }
}
