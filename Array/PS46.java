package Array;

public class PS46 {
    public static void main(String[] args) {
        int[] nums = { -1, 10, 6, 7, -7, 1 };
        System.out.println(max(nums));
    }

    public static int max(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == -nums[j]) {
                    max = Math.max(max, nums[i]);
                }
            }
        }
        return max;
    }
}