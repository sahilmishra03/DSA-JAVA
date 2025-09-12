package Queue;

import java.util.ArrayList;
import java.util.List;

public class MySimpleQueue {
    public static class MyQueue {
        static List<Integer> list;
        static int ptr;

        MyQueue() {
            list = new ArrayList<>();
            ptr = 0;
        }

        public static void enqueue(int x) {
            list.add(x);
        }

        public static boolean dequeue() {
            if (isEmpty()) {
                return false;
            }
            ptr = ptr + 1;
            return true;
        }

        public static boolean isEmpty() {
            if (ptr >= list.size()) {
                return true;
            }

            return false;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return list.get(ptr);
        }
    }

    public static void main(String[] args) {
        MyQueue.enqueue(10);
        System.out.println(MyQueue.peek());

        MyQueue.enqueue(20);
        System.out.println(MyQueue.peek());

        MyQueue.enqueue(30);
        System.out.println(MyQueue.peek());

        MyQueue.enqueue(40);
        System.out.println(MyQueue.peek());

        System.out.println(MyQueue.isEmpty());

        MyQueue.dequeue();
        System.out.println(MyQueue.peek());

        MyQueue.dequeue();
        System.out.println(MyQueue.peek());

        MyQueue.dequeue();
        System.out.println(MyQueue.peek());

        MyQueue.dequeue();
        System.out.println(MyQueue.peek());

        System.out.println(MyQueue.isEmpty());
    }
}
