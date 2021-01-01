package com.company.strings;


import java.util.HashSet;
import java.util.Set;

public class uniqueEmailAddress {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    private static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(defang(email));
        }

        return set.size();
    }

    private static String defang(String email) {
        String[] parts = email.split("@");
        String mainPart = parts[0].split("\\+")[0];
        StringBuilder sb = new StringBuilder();
        for (String s : mainPart.split("\\.")) {
            sb.append(s);
        }
        sb.append("@");
        sb.append(parts[1]);

        return sb.toString();
    }
}
