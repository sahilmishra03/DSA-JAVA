package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PS13 {
    public static class Row implements Comparable<Row> {
        int i;
        int count;

        Row(int i, int count) {
            this.i = i;
            this.count = count;
        }

        @Override
        public int compareTo(Row obj) {
            if (this.count == obj.count) {
                return this.i - obj.i;
            }
            return this.count - obj.count;
        }

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
        int k = 2;
        System.out.println(Arrays.toString(kWeakestRows(mat, k)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    cnt++;
                }
            }
            Row obj = new Row(i, cnt);
            pq.add(obj);
        }

        int[] res = new int[k];

        for (int index = 0; index < k; index++) {
            Row value = pq.poll();
            res[index] = value.i;
        }

        return res;
    }
}