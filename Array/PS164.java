package Array;

import java.util.Arrays;
import java.util.Stack;

public class PS164 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);

        stack2.add(11);
        stack2.add(21);
        stack2.add(31);
        stack2.add(41);
        int[] arr = new int[stack1.size() + stack2.size()];

        int top1 = -1;
        int top2 = arr.length;

        while (!stack1.isEmpty()) {
            top1 = top1 + 1;
            arr[top1] = stack1.pop();
        }
        while (!stack2.isEmpty()) {
            top2 = top2 - 1;
            arr[top2] = stack2.pop();
        }

        System.out.println(Arrays.toString(arr));
    }
}
