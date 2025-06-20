package Heap;

import java.util.PriorityQueue;

public class PS15 {
    public static class HelperClass implements Comparable<HelperClass> {
        int value;
        int idx;

        HelperClass(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(HelperClass obj) {
            return this.value - obj.value;
        }
    }

    public static int[] arrayRankTransform(int[] arr) {
        PriorityQueue<HelperClass> pq = new PriorityQueue<>();
        for (int index = 0; index < arr.length; index++) {
            pq.add(new HelperClass(arr[index], index));
        }

        int rank = 0;
        int prev = Integer.MIN_VALUE;
        int[] res = new int[arr.length];

        while (!pq.isEmpty()) {
            HelperClass data = pq.poll();
            if (data.value != prev) {
                rank++;
                prev = data.value;
            }
            res[data.idx] = rank;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30, 20 };
        int[] result = arrayRankTransform(arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
