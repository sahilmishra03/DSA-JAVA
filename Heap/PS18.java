package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PS18 {
    public static void main(String[] args) {
        int[] score = { 10, 3, 8, 9, 4 };
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> {
            return e2[0] - e1[0];
        });

        for (int i = 0; i < score.length; i++) {
            pq.add(new int[] { score[i], i });
        }

        String[] res = new String[score.length];
        int n = 1;
        for (int i = 0; i < res.length; i++) {
            int[] value = pq.poll();
            if (n == 1) {
                res[value[1]] = "Gold Medal";
            } else if (n == 2) {
                res[value[1]] = "Silver Medal";
            } else if (n == 3) {
                res[value[1]] = "Bronze Medal";
            } else {
                res[value[1]] = String.valueOf(n);
            }

            n++;
        }

        return res;
    }
}
