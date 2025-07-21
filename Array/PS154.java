package Array;

import java.util.Arrays;

public class PS154 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 2 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        int cnt = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                cnt++;
            } else {
                continue;
            }
        }

        return cnt;
    }
}
