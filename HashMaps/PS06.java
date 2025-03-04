package HashMaps;

import java.util.*;;

public class PS06 {
    public static void main(String[] args) {
        String s = "vvvvvvvvvvvvvvvvvvv";
        System.out.println(areOccurrencesEqual(s));
    }
    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        int frequency = hashMap.get(s.charAt(0));

        for (Character character : hashMap.keySet()) {
            if (hashMap.get(character) != frequency) {
                return false;
            }
        }

        return true;
    }
}
