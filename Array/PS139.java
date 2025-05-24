package Array;

public class PS139 {
    public static void main(String[] args) {
        int[] nums = { 7, 52, 2, 4 };
        System.out.println(findTheArrayConcVal(nums));
    }

    public static long findTheArrayConcVal(int[] nums) {
        long result = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            String value = String.valueOf(nums[left]) + String.valueOf(nums[right]);
            int valueInt = Integer.parseInt(value);
            result += valueInt;
            left++;
            right--;
        }
        if (left == right) {
            result += nums[left];
        }

        return result;
    }
}