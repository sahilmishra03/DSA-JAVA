package Heap;

import java.util.*;

public class PS04 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int[] output = new int[nums.length - k + 1];
        int index = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        output[index++] = pq.peek();

        for (int i = k; i < nums.length; i++) {
            pq.remove(nums[i - k]);
            pq.add(nums[i]);
            output[index++] = pq.peek();
        }

        System.out.println(Arrays.toString(output));
    }
}
