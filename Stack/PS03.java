package Stack;

import java.util.Stack;

public class PS03 {
    public static void main(String[] args) {
        String[] tokens = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "+" || tokens[i] == "*" || tokens[i] == "-" || tokens[i] == "/") {
                int value2 = stack.pop();
                int value1 = stack.pop();

                if (tokens[i] == "+") {
                    stack.push(value1 + value2);
                } else if (tokens[i] == "-") {
                    stack.push(value1 - value2);
                } else if (tokens[i] == "*") {
                    stack.push(value1 * value2);
                } else {
                    stack.push(value1 / value2);
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.peek();
    }
}