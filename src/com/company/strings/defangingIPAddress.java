package com.company.strings;


public class defangingIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPAddr(address));
    }

    private static String defangIPAddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
