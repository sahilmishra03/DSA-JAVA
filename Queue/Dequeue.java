package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addLast(1);
        stack.addLast(2);
        System.out.println(stack.peekLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.isEmpty());

    }
}
