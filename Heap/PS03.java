package Heap;

import java.util.PriorityQueue;

public class PS03 {
    static class Row implements Comparable<Row> {
        int value;
        int idx;

        public Row(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row R2) {
            if (this.value == R2.value) {
                return this.idx - R2.idx;
            } else {
                return this.value - R2.value;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("Row " + pq.remove().idx);
        }
    }
}
