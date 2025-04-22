package Heap;

import java.util.ArrayList;

public class HEAP_IMPLEMENTATION {
    static class Heap {
        ArrayList<Integer> arrayList = new ArrayList<>();

        public void add(int data) {
            arrayList.add(data);
            int x = arrayList.size() - 1;
            int par = (x - 1) / 2;

            while (x > 0 && arrayList.get(x) > arrayList.get(par)) {
                int temp = arrayList.get(x);
                arrayList.set(x, arrayList.get(par));
                arrayList.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arrayList.get(0);
        }

        public int remove() {
            int data = arrayList.get(0);

            // Step 1: Swap root with last element
            int temp = arrayList.get(0);
            arrayList.set(0, arrayList.get(arrayList.size() - 1));
            arrayList.set(arrayList.size() - 1, temp);

            // Step 2: Remove the last element
            arrayList.remove(arrayList.size() - 1);

            // Step 3: Heapify
            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arrayList.size() && arrayList.get(minIdx) < arrayList.get(left)) {
                minIdx = left;
            }

            if (right < arrayList.size() && arrayList.get(minIdx) < arrayList.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = arrayList.get(i);
                arrayList.set(i, arrayList.get(minIdx));
                arrayList.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public boolean isEmpty() {
            return arrayList.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
