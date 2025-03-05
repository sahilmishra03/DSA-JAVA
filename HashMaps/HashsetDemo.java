package HashMaps;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        System.out.println("HashSet elements: " + hashset);
        System.out.println(hashset.size());
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.contains(2));
        System.out.println(hashset.remove(1));
        System.out.println(hashset);
        @SuppressWarnings("rawtypes")
        Iterator iterator = hashset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer integer : hashset) {
            System.out.println(integer);
        }
    }
}
