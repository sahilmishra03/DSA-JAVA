package String;

import java.util.HashMap;
public class PS29 {
    public static void main(String[] args) {
        String s = "baadccab";
        System.out.println(minimizedStringLength(s));
    }

    public static int minimizedStringLength(String s) {
        HashMap<Character,Integer> hashtable= new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashtable.containsKey(c)) {
                hashtable.put(c, hashtable.get(c)+1);
            }else{
                hashtable.put(c, 1);
            }
        }
        return hashtable.size();
    }
}