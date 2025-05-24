package Array;

import java.util.Arrays;

public class PS140 {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 7, 5, 10 };
        System.out.println(Arrays.toString(findPrefixScore(nums)));
    }

    public static long[] findPrefixScore(int[] nums) {
        int[] sum = new int[nums.length];
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, nums[i]);
            sum[i] = nums[i] + maxValue;
        }

        long preSum[] = new long[nums.length];
        preSum[0] = sum[0];

        for (int i = 1; i < sum.length; i++) {
            preSum[i] = preSum[i - 1] + sum[i];
        }

        return preSum;
    }
}
