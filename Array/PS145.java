package Array;

import java.util.Arrays;

public class PS145 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3 };
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    result[i] = nums[j];
                    break;
                } else {
                    result[i] = -1;
                }
                if (i == nums.length - 1) {
                    result[i] = nextGreaterElementsForLastIndex(nums, nums[i]);
                }
            }
        }
        return result;
    }

    public static int nextGreaterElementsForLastIndex(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (value < nums[i]) {
                return nums[i];
            }
        }

        return -1;
    }

}
