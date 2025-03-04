package Array;

public class PS68 {
    public static void main(String[] args) {
        int[] nums = { 10, 10, 3, 7, 6 };
        System.out.println(countPartitions(nums));
    }

    public static int countPartitions(int[] nums) {
        int count = 0;
        int sum1 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            int sum2 = 0;

            for (int j = i + 1; j < nums.length; j++) {
                sum2 += nums[j];

                if (j == nums.length - 1) {
                    if ((sum1 - sum2) % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
