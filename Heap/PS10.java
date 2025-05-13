package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PS10 {
    public static void main(String[] args) {
        int[][] grid = { { 1, 2, 4 }, { 3, 3, 1 } };
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                pq.add(grid[i][j]);
            }
        }

        int res = 0;
        int cnt = 0;

        while (!pq.isEmpty()) {
            int data = pq.poll();
            if (cnt % 2 == 0) {
                res += data;
            }
            cnt++;
        }
        return res;
    }
}
