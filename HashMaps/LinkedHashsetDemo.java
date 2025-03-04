package HashMaps;
import java.util.*;
public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(3);
        for (Object object : linkedHashSet) {
            System.out.println(object);
        }
    }
}
