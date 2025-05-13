package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PS11 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5 };
        int k = 3;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr, k)));
    }

    static class Fractions implements Comparable<Fractions> {
        int x;
        int y;
        double fractions;

        public Fractions(int x, int y, double fractions) {
            this.x = x;
            this.y = y;
            this.fractions = fractions;
        }

        @Override
        public int compareTo(Fractions p2) {
            return Double.compare(this.fractions, p2.fractions);
        }

    }

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Fractions> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                double addValue = arr[i] / arr[j];
                pq.add(new Fractions(arr[i], arr[j], addValue));
            }
        }

        int res[] = new int[2];
        for (int i = 0; i < k; i++) {
            Fractions curr = pq.poll();
            res[0] = curr.x;
            res[0] = curr.y;
        }

        return res;
    }
}