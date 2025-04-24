package Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class PS06 {
    public static class Number implements Comparable<Number> {
        int element;
        int freq;

        Number(int element, int freq) {
            this.element = element;
            this.freq = freq;
        }

        @Override
        public int compareTo(Number number2) {
            // max heap
            // return number2.freq - this.freq;
            // min heap
            return this.freq - number2.freq;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        // Method 1
        // for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
        // Number number = new Number(entry.getKey(), entry.getValue());
        // pq.add(number);

        // if (pq.size() > k) {
        // pq.poll();
        // }
        // }
        // Method 2
        Set<Integer> set = hashMap.keySet();
        for (Integer integer : set) {
            Number number = new Number(integer, hashMap.get(integer));
            pq.add(number);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] res = new int[k];
        int index = 0;

        while (index < k) {
            Number number = pq.poll();
            res[index] = number.element;
            index++;
        }

        return res;
    }
}
