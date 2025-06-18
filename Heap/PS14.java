package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class PS14 {
    public static class FrequenceOfNumber implements Comparable<FrequenceOfNumber> {
        int num;
        int freq;

        FrequenceOfNumber(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }

        @Override
        public int compareTo(FrequenceOfNumber obj) {
            return this.freq - obj.freq;
        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                map.put(nums[index], map.get(nums[index]) + 1);
            } else {
                map.put(nums[index], 1);
            }
        }

        PriorityQueue<FrequenceOfNumber> pq = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            pq.add(new FrequenceOfNumber(i, map.get(i)));
        }
        int[] res = new int[k];
        for (int index = 0; index < k; index++) {
            FrequenceOfNumber value = pq.poll();
            res[index] = value.num;
        }

        return res;
    }
}