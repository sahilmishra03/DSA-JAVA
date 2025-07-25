package Heap;

import java.util.PriorityQueue;

public class PS17 {
    public static void main(String[] args) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[0] - e2[0]);
        int[][] points = { { 1, 3 }, { -2, 2 } };
        int k = 1;

        for (int i = 0; i < points.length; i++) {
            int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new int[] { distSq, points[i][0], points[i][1] });
        }

        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            int[] closest = pq.poll();
            System.out.println("[" + closest[1] + ", " + closest[2] + "]");
        }
    }
}
