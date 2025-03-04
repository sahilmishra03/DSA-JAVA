package String;

import java.util.HashMap;
import java.util.Set;

public class PS47 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> HashMap1 = new HashMap<>();
        HashMap<Character, Integer> HashMap2 = new HashMap<>();
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            HashMap1.put(c, HashMap1.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            HashMap2.put(c, HashMap2.getOrDefault(c, 0) + 1);
        }

        Set<Character> set1 = HashMap1.keySet();

        for (Character character : set1) {
            if (HashMap2.getOrDefault(character, 0) < HashMap1.get(character)) {
                return false;
            }
        }
        return true;
    }
}