package Heap;

import java.util.*;

public class PS12 {
    public static void main(String[] args) {
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int integer : stones) {
            pq.add(integer);
        }

        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if (x != y) {
                pq.add(y - x);
            }
        }

        if (pq.size() == 0) {
            return 0;
        }

        return pq.peek();
    }
}   