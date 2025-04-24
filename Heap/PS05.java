package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PS05 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        int res = 0;
        for (int i = 1; i <= k; i++) {
            if (k == i) {
                res = pq.peek();
            } else {
                pq.remove();
            }
        }

        System.out.println(res);
    }
}
