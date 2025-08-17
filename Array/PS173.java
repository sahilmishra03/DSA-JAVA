package Array;

import java.util.HashSet;

public class PS173 {
    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String emailString = emails[i];
            String[] parts = emailString.split("@");
            String local = parts[0];
            String domain = parts[1];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < local.length(); j++) {
                if (local.charAt(j) == '.') {
                    continue;
                } else if (local.charAt(j) == '+') {
                    break;
                } else {
                    sb.append(emailString.charAt(j));
                }
            }

            String newEmail = sb.toString() + "@" + domain;
            set.add(newEmail);
        }

        return set.size();

    }
}
