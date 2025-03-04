package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class PS02 {
    static class InnerPS02 {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        InnerPS02 s = new InnerPS02();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());
    }
}
