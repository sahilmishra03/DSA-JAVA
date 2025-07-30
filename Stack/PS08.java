package Stack;

import java.util.Arrays;
import java.util.Stack;

public class PS08 {
    public static void main(String[] args) {
        int[] nums = { 3, 9, 4, 0, 2 };
        System.out.println(Arrays.toString(prevSmallerElement(nums)));
    }

    private static int[] prevSmallerElement(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = result.length - 1; i >= 0; i--) {
            while (true) {
                if (stack.isEmpty()) {
                    stack.push(i);
                    break;
                }

                int idx = stack.peek();

                if (nums[i] < nums[idx]) {
                    result[idx] = nums[i];
                    stack.pop();
                } else {
                    stack.push(i);
                    break;
                }
            }
        }

        return result;
    }
}
