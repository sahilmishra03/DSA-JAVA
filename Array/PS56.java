package Array;

public class PS56 {
    public static void main(String[] args) {
        int[] nums = { -10, 8, 6, 7, -2, -3 };
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int negative = -(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == negative) {
                    max = Math.max(nums[i], max);
                }
            }
        }
        if (max == Integer.MIN_VALUE) {
            return -1;
        }
        return max;
    }
}
