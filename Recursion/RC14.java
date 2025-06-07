package Recursion;

import java.util.HashSet;

public class RC14 {
    public static void main(String[] args) {
        subsets("aaa", 0, "", new HashSet<String>());
    }

    public static void subsets(String str, int idx, String newString, HashSet<String> hashSet) {
        if (idx == str.length()) {
            if (!hashSet.contains(newString)) {
                System.out.println(newString);
                hashSet.add(newString);
            }
            return;
        }

        char c = str.charAt(idx);

        // pick
        subsets(str, idx + 1, newString + c, hashSet);
        // no pick
        subsets(str, idx + 1, newString, hashSet);
    }
}
