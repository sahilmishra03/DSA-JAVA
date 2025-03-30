package Array;

import java.util.Arrays;

public class PS89 {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int firstPair = nums[0] * nums[1];
        int secondPair = nums[nums.length - 2] * nums[nums.length - 1];

        return secondPair - firstPair;
    }
}
