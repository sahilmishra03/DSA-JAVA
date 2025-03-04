package Stack;
import java.util.*;
public class PS01 {
    public static void main(String[] args) {
        Stack<Integer> res = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()) {
            int value=stack.peek();
            res.push(value);
            stack.pop();
        }

        while (!res.isEmpty()) {
            System.out.println(res.peek());
            res.pop();
        }
    }
}
