package HashMaps;

import java.util.HashMap;

public class PS07 {
    public static void main(String[] args) {
        String string = "leetcode";
        System.out.println(checkIfPangram(string));
    }

    public static boolean checkIfPangram(String sentence) {
        sentence.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c =sentence.charAt(i);
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c)+1);
            }else{
                hashMap.put(c, 1);
            }
        }
        if (hashMap.size()==26) {
            return true;
        }
        return false;
    }
}
