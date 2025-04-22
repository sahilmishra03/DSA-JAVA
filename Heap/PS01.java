package Heap;

import java.util.PriorityQueue;

public class PS01 {
    public static void main(String[] args) {
        int[][] points = { { 1, 3 }, { -2, 2 } };
        int k = 1;

        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            int distsq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Points(points[i][0], points[i][1], distsq,i));
        }

        for (int i = 0; i <k; i++) {
            System.out.println(pq.remove().idx);
        }
    }

    public static class Points implements Comparable<Points> {
        int x;
        int y;
        int distsq;
        int idx;

        Points(int x, int y, int distsq,int idx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Points objPoints) {
            return this.distsq - objPoints.distsq;
        }
    }
}
