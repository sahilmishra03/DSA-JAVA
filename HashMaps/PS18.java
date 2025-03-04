package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class PS18 {
    public static void main(String[] args) {
        String word1 = "aaaa";
        String word2 = "bccb";
        System.out.println(checkAlmostEquivalent(word1, word2));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> hashMapForWord1 = new HashMap<>();
        HashMap<Character, Integer> hashMapForWord2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (hashMapForWord1.containsKey(c)) {
                hashMapForWord1.put(c, hashMapForWord1.get(c) + 1);
            } else {
                hashMapForWord1.put(c, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            if (hashMapForWord2.containsKey(c)) {
                hashMapForWord2.put(c, hashMapForWord2.get(c) + 1);
            } else {
                hashMapForWord2.put(c, 1);
            }
        }

        Set<Character> set1 = hashMapForWord1.keySet();
        Set<Character> set2 = hashMapForWord2.keySet();

        for (Character character1 : set1) {
            int freq1 = hashMapForWord1.get(character1);
            int freq2 = hashMapForWord2.containsKey(character1) ? hashMapForWord2.get(character1) : 0;
            if (Math.abs(freq1 - freq2) > 3) {
                return false;
            }
        }

        for (Character character2 : set2) {
            if (!set1.contains(character2)) {
                int freq2 = hashMapForWord2.get(character2);
                int freq1 = hashMapForWord1.containsKey(character2) ? hashMapForWord1.get(character2) : 0;
                if (Math.abs(freq1 - freq2) > 3) {
                    return false;
                }
            }
        }

        return true;
    }
}