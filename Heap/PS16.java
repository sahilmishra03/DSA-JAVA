package Heap;

import java.util.*;

public class PS16 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 3 };
        FrequencySorter sorter = new FrequencySorter();
        int[] result = sorter.frequencySort(nums);
        System.out.println(Arrays.toString(result));
    }
}

class FrequencySorter {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);

            }
        }

        PriorityQueue<Element> heap = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            heap.add(new Element(entry.getKey(), entry.getValue()));
        }

        int[] result = new int[nums.length];
        int index = 0;

        while (!heap.isEmpty()) {
            Element el = heap.poll();
            for (int i = 0; i < el.frequency; i++) {
                result[index++] = el.value;
            }
        }

        return result;
    }

    static class Element implements Comparable<Element> {
        int value;
        int frequency;

        public Element(int value, int frequency) {
            this.value = value;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Element other) {

            if (this.frequency != other.frequency) {
                return this.frequency - other.frequency;
            }

            return other.value - this.value;
        }
    }
}
