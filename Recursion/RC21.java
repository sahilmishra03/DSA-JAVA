package Recursion;

import java.util.HashSet;

public class RC21 {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        generateSubsequences(text1, "", 0, set1);
        generateSubsequences(text2, "", 0, set2);

        int maxLength = 0;
        for (String subseq : set1) {
            if (set2.contains(subseq)) {
                maxLength = Math.max(maxLength, subseq.length());
            }
        }
        return maxLength;
    }

    private static void generateSubsequences(String s, String current, int index, HashSet<String> set) {
        if (index == s.length()) {
            set.add(current);
            return;
        }

        generateSubsequences(s, current + s.charAt(index), index + 1, set);

        generateSubsequences(s, current, index + 1, set);
    }
}
