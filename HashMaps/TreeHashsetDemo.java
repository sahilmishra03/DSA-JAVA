package HashMaps;

import java.util.TreeSet;

public class TreeHashsetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(4);
        System.out.println(treeSet);
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}
