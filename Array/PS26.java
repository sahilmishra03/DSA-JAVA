package Array;

public class PS26 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5};
        System.out.println(triangleType(nums));
    }

    public static String triangleType(int[] nums) {
        if (nums.length != 3) {
            return "Invalid input: A triangle must have exactly 3 sides.";
        }

        java.util.Arrays.sort(nums);

        if (nums[0] + nums[1] <= nums[2]) {
            return "Not a triangle";
        }

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
