package com.company.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class buddyStrings {
    public static void main(String[] args) {
        String A = "aaaaaaabc"; //swap two letters in string A so the result is equal to b
        String B = "aaaaaaacb";
        System.out.println(checkBuddyStrings(A, B));
    }

    private static boolean checkBuddyStrings(String A, String B) {
        if (A.length() != B.length()) return  false;
        if (A.equals(B)) {
            HashSet<Character> hashSet = new HashSet<>(); //does not allow duplicates
            for (char c : A.toCharArray()) {
                hashSet.add(c);
            }

            return hashSet.size() < A.length();
        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)){
                    list.add(i);
                }
            }

            return list.size() == 2 && A.charAt(list.get(0)) == B.charAt(list.get(1)) && A.charAt(list.get(1)) == B.charAt(list.get(0));
        }
    }
}
