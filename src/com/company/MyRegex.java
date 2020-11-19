package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {
    public static void main(String[] args) {
        //valid IP address
       /* 000.12.12.034
        121.234.12.12
        23.45.12.56*/
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("000.12.12.034");
        if (matcher.matches()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
