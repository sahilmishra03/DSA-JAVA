package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class PS07 {
    public static class Element implements Comparable<Element> {
        char character;
        int freq;

        public Element(char character, int freq) {
            this.character = character;
            this.freq = freq;
        }

        @Override
        public int compareTo(Element element) {
            return element.freq - this.freq;
        }

    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }

        PriorityQueue<Element> pq = new PriorityQueue<>();
        Set<Character> set = hashMap.keySet();
        for (Character character : set) {
            Element element = new Element(character, hashMap.get(character));
            pq.add(element);
        }

        // result
        StringBuilder str = new StringBuilder();
        while (pq.size() > 0) {
            Element element = pq.poll();
            while (element.freq > 0) {
                str.append(element.character);
                element.freq--;
            }
        }

        return str.toString();
    }
}
