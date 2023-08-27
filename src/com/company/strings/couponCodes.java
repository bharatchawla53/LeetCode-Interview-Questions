package com.company.strings;

public class couponCodes {
    public static void main(String[] args) {
        System.out.println(getMaximumCouponvalue("abcc", 2));
        System.out.println(getMaximumCouponvalue("bcaa", 3));
    }

    private static int getMaximumCouponvalue(String coupon, int k) {
        int index = 0;
        int result = 0;

        while (index < coupon.length() && index + k <= coupon.length()) {
            result = Math.max(result, getCouponValue(coupon.substring(index, index + k)));
            index++;
        }

        return result;
    }

    private static int getCouponValue(String coupon) {
        int mod = (int) 1e7;

        int[] freq = new int[26];

        for (int i = 0; i < coupon.length(); i++) {
            freq[coupon.charAt(i) - 'a']++;
        }

        int value = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                value += Math.pow(i + 1, freq[i]);
            }
        }

        return value % mod;
    }

}
