package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class PS08 {
    public static class Pair implements Comparable<Pair> {
        List<Integer> list;
        int sum;

        Pair(List<Integer> list, int sum) {
            this.list = list;
            this.sum = sum;
        }

        @Override
        public int compareTo(Pair obj) {
            return this.sum - obj.sum;
        }

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 7, 11 };
        int nums2[] = { 2, 4, 6 };
        System.out.println(kSmallestPairs(nums1, nums2, 3));
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<List<Integer>, Integer> hashMap = new HashMap<>();
        Set<List<Integer>> set = hashMap.keySet();
        List<List<Integer>> output = new ArrayList<>();

        // Insert value in hashmap
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = 0;
                sum = nums1[i] + nums2[j];
                list.add(nums1[i]);
                list.add(nums2[j]);
                hashMap.put(list, sum);
            }
        }

        // Insert value in PQ
        for (List<Integer> list : set) {
            Pair p = new Pair(list, hashMap.get(list));
            pq.add(p);
        }

        // Result
        for (int i = 0; i < k; i++) {
            Pair pair = pq.poll();
            output.add(pair.list);
        }

        return output;
    }
}