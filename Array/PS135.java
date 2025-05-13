package Array;

import java.util.HashSet;

public class PS135 {
    public static void main(String[] args) {
        String[] words = { "aba", "aabb", "abcd", "bac", "aabc" };
        System.out.println(similarPairs(words));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isSimilarPairs(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static boolean isSimilarPairs(String string1, String string2) {
        HashSet<Character> hashSet1 = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();
        for (int i = 0; i < string1.length(); i++) {
            hashSet1.add(string1.charAt(i));
        }

        for (int i = 0; i < string2.length(); i++) {
            hashSet2.add(string2.charAt(i));
        }

        return hashSet1.equals(hashSet2);
    }
}