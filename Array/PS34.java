package Array;

import java.util.Arrays;

public class PS34 {
    public static void main(String[] args) {
        int[] nums = {48, 20, 30, 12, 41};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        int max = 1;

        for (int i = 1; i <= smallest; i++) {
            if (smallest % i == 0 && largest % i == 0) {
                max = i;
            }
        }
        return max;
    }
}
