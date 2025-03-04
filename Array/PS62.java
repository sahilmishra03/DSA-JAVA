package Array;

import java.util.Arrays;

public class PS62 {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int index = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[index] = nums[nums[i]];
            index++;
        }
        return res;
    }
}
