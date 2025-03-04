package HashMaps;
import java.util.*;
public class PS03 {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        Boolean rBoolean=isAnagram(s, t);
        System.out.println(rBoolean);
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hMap= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hMap.containsKey(ch)) {
                hMap.put(ch, hMap.get(ch) + 1);
            }else{
                hMap.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (hMap.get(ch)!=null) {
                if (hMap.get(ch)==1) {
                    hMap.remove(ch);
                }else{
                    hMap.put(ch, hMap.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hMap.isEmpty();
    }
}