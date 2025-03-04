package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class PS03 {
    static class InnerPS03 {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        InnerPS03 queue = new InnerPS03();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.remove());
    }
}
