package String;

import java.util.HashMap;

public class PS65 {
    public static void main(String[] args) {
        // 2351 LC
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char result = '\0';
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                result = s.charAt(i);
                break;
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        return result;
    }
}
