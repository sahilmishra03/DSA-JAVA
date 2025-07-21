package Array;

import java.util.Arrays;

public class PS152 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 3, 1 };
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        int cnt = 0;
        // Brute Force Approach
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] > 2 * nums[j]) {
        // cnt++;
        // }
        // }
        // }

        // Optimised Approach
        int i = nums.length - 1;
        int j = 0;
        Arrays.sort(nums);
        while (j <= i) {
            if (nums[i] > 2 * nums[j]) {
                j++;
                cnt++;
            } else {
                i--;
                j = 0;
            }
        }
        return cnt;
    }
}
