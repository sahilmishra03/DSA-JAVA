package Stack;

import java.util.HashSet;
import java.util.Stack;

public class PS12 {
    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String value = tokens[i];

            if (set.contains(value)) {
                int value2 = stack.pop();
                int value1 = stack.pop();
                if (value.equals("+")) {
                    stack.push(value1 + value2);
                } else if (value.equals("-")) {
                    stack.push(value1 - value2);
                } else if (value.equals("*")) {
                    stack.push(value1 * value2);
                } else {
                    stack.push(value1 / value2);
                }
            } else {
                stack.push(Integer.parseInt(value));
            }
        }
        return stack.peek();
    }
}
