package Array;

public class PS45 {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 9 };
        int original = 4;
        System.out.println(findFinalValue(nums, original));
    }

    public static int findFinalValue(int[] nums, int original) {
        for (int j = 0; j < nums.length; j++) {
            if (original == nums[j]) {
                original = original * 2;
            }
        }
        return original;
    }
}
