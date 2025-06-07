package Recursion;

import java.util.HashSet;

public class RC12 {
    public static void main(String[] args) {
        String giveString = "abbcda";
        HashSet<Character> helper = new HashSet<>();
        String result = removeDuplicate(giveString, "", helper, 0);
        System.out.println(result);
    }

    public static String removeDuplicate(String string1, String string2, HashSet<Character> hashSet, int idx) {
        if (idx == string1.length()) {
            return string2;
        }

        char c = string1.charAt(idx);
        if (!hashSet.contains(c)) {
            hashSet.add(c);
            string2 += c;
        }

        return removeDuplicate(string1, string2, hashSet, idx + 1);
    }
}
