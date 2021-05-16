package com.company.strings;

public class binaryStringAlternating {
    public static void main(String[] args) {
        String word = "111000";
        System.out.println(minSwaps(word));
    }

    private static int minSwaps(String s) {
        int l1 = swaps(s, '0');
        int l2 = swaps(s, '1');
        if(l1 == -1) {
            return l2;
        }
        if(l2 == -1) {
            return l1;
        }

        return Math.min(l1,l2);
    }

    private static int swaps(String s, char next) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0' && next == '0') {
                next = '1';
            } else if (ch == '0' && next == '1') { // wrong, so count
                zero++;
                next = '0';
            } else if (ch == '1' && next == '1') {
                next = '0';
            } else if (ch == '1' && next == '0') { // wrong, so count
                one++;
                next = '1';
            }
        }
        return one == zero ? one : -1;
    }
}
