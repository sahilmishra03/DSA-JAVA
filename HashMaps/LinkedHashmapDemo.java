package HashMaps;

import java.util.*;

public class LinkedHashmapDemo {
    public static void main(String[] args) {
        System.out.println("Linked Hashmap Demo");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 250);
        lhm.put("China", 350);
        lhm.put("Pakintan", 550);
        System.out.println(lhm);
    }
}
