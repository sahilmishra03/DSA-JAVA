package Heap;

import java.util.*;

public class PS19 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 7, 11 };
        int[] nums2 = { 2, 4, 6 };
        int k = 3;

        System.out.println(kSmallestPairs(nums1, nums2, k));
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e2[0] - e1[0]);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int value = nums1[i] + nums2[j];

                if (pq.size() < k) {
                    pq.add(new int[] { value, nums1[i], nums2[j] });
                } else {
                    if (pq.peek()[0] > value) {
                        pq.poll();
                        pq.add(new int[] { value, nums1[i], nums2[j] });
                    } else {
                        break;
                    }
                }
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            result.add(Arrays.asList(pair[1], pair[2]));
        }
        Collections.reverse(result);
        return result;

    }
}