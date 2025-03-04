package Array;

import java.util.Arrays;

public class PS77 {
    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        for (int index1 = nums.length - 1; index1 >= 0; index1--) {
            int sum = 0;
            for (int index2 = index1 - 1; index2 >= 0; index2--) {
                if (index1 == 0) {
                    leftSum[index1] = 0;
                } else {
                    sum += nums[index2];
                }
            }
            leftSum[index1] = sum;
        }

        int[] rightSum = new int[nums.length];
        for (int index1 = 0; index1 < nums.length; index1++) {
            int sum = 0;
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                if (index1 == nums.length - 1) {
                    leftSum[index1] = 0;
                } else {
                    sum += nums[index2];
                }
            }
            rightSum[index1] = sum;
        }

        int[] res = new int[nums.length];

        for (int index = 0; index < leftSum.length; index++) {
            res[index] = Math.abs(leftSum[index] - rightSum[index]);
        }

        return res;
    }
}