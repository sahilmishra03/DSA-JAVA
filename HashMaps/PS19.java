package HashMaps;

import java.util.HashMap;

public class PS19 {
    public static void main(String[] args) {
        String s = "1210";
        System.out.println(digitCount(s));
    }

    public static boolean digitCount(String num) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digitCount = Character.getNumericValue(c);
            if (hashMap.get(c) != digitCount) {
                return false;
            }
        }
        
        return true;
    }
}
