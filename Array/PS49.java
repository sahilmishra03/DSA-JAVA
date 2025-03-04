package Array;

public class PS49 {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 5 };
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int num1 = maxValue(nums, Integer.MIN_VALUE);
        int index = maxValueIndex(nums, num1);
        int num2 = maxValue(nums, index);
        return (num1 - 1) * (num2 - 1);
    }

    public static int maxValue(int[] nums, int max) {
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    public static int maxValueIndex(int[] nums, int max) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                index = i;
                break;
            }
        }
        return index;
    }
}
