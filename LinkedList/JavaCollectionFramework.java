package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(4);

        l2.addLast(1);
        l2.addLast(3);
        l2.addLast(4);

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            a1.add(l1.get(i));
        }

        for (int i = 0; i < l2.size(); i++) {
            a2.add(l2.get(i));
        }

        int[] mix = new int[a1.size() + a2.size()];
        int i = 0, j = 0, k = 0;

        while (i < a1.size() && j < a2.size()) {
            if (a1.get(i) < a2.get(j)) {
                mix[k++] = a1.get(i++);
            } else {
                mix[k++] = a2.get(j++);
            }
        }

        while (i < a1.size()) {
            mix[k++] = a1.get(i++);
        }

        while (j < a2.size()) {
            mix[k++] = a2.get(j++);
        }

        LinkedList<Integer> res = new LinkedList<>();
        for (int z = 0; z < mix.length; z++) {
            res.addLast(mix[z]);
        }

        System.out.println(res);
    }
}
