package Heap;

import java.util.PriorityQueue;

public class PS09 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        System.out.println(kthSmallest(matrix, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                priorityQueue.add(matrix[i][j]);
            }
        }

        int res = 0;
        for (int i = 0; i < k; i++) {
            res = priorityQueue.poll();
        }

        return res;
    }
}