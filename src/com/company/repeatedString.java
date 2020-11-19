package com.company;

public class repeatedString {
    public static void main(String[] args) {
        int n = 10;
        String s = "aba";
        repeatingString(n, s);
    }

    private static void repeatingString(int n, String s) {
        int count = 0;
        int remainder = n / s.length();
        int mod = n % s.length();
        String updatedS = s;
        for (int i = 0; i < remainder - 1; i++) {
            updatedS = updatedS.concat(s);
        }
        updatedS = updatedS.concat(s.substring(0, mod));

        //System.out.println(updatedS + updatedS.length());

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        count = count * remainder + mod;
        System.out.println(count);
    }
}
