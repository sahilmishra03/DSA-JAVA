package Stack;

import java.util.Stack;

public class PS01 {
    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int asciiValue = c;

            if (asciiValue >= 48 && asciiValue <= 57) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        String res = "";

        for (Character character : stack) {
            res += character;
        }

        return res;
    }
}
