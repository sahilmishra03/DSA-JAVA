package Array;

public class PS76 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1 };
        System.out.println(subarraySum(nums));
    }

    public static int subarraySum(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            int start = Math.max(0, index - nums[index]);
            for (int i = start; i <= index; i++) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
