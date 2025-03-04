package HashMaps;

import java.util.*;

public class PS12 {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        int sum = 0;
        Set<Character> characters = hashMap.keySet();
        for (Character character : characters) {
            for (int i = 0; i < jewels.length(); i++) {
                char c = jewels.charAt(i);
                if (c == character) {
                    sum += hashMap.get(character);
                }
            }
        }
        return sum;
    }
}
