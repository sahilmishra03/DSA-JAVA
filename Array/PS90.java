package Array;

public class PS90 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 6, 7, 10 };
        System.out.println(arithmeticTriplets(nums, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}