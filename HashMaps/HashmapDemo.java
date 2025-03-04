package HashMaps;
import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 20);
        map.put("Usa", 30);
        map.put("China", 40);
        System.out.println(map.size());
        // System.out.println(map);
        // map.put("China", 180);
        // System.out.println(map);
        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // Set<String> keys = map.keySet();
        // for (String key : keys) {
        //     System.out.println(key);
        // }
        // map.remove("China");
        // System.out.println(map);
        // System.out.println( map.size());
        Set<String> keys = map.keySet();
        // System.out.println(keys);
        for (String string : keys) {
            System.out.print(string+" ");
            System.out.println(map.get(string));
        }
    }
}
