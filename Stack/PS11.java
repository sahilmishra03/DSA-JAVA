package Stack;

import java.util.Stack;

public class PS11 {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c2 = s.charAt(i);
            if (!stack.isEmpty()) {
                char c1 = stack.peek();
                if ((c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}')) {
                    stack.pop();
                } else {
                    stack.push(c2);
                }
            } else {
                stack.push(c2);
            }
        }

        return stack.isEmpty();
    }
}