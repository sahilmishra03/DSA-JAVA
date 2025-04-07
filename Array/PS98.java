package Array;

import java.util.Arrays;

public class PS98 {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 2 };
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                res += nums[i];
            }
        }
        return res;
    }
}
