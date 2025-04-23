package Heap;

import java.util.PriorityQueue;

public class PS02 {
    public static void main(String[] args) {
        int repoes[] = { 2, 3, 3, 4, 6 };
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < repoes.length; i++) {
            pq.add(repoes[i]);
        }

        int cost = 0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println(cost);
    }
}
