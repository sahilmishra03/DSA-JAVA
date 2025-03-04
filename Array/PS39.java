package Array;

public class PS39 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2 };
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        if (ifAscending(nums)) {
            return true;
        } else if (ifDescending(nums)) {
            return true;
        }
        return false;
    }

    public static boolean ifAscending(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean ifDescending(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
