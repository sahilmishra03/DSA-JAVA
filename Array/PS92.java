package Array;

public class PS92 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int opt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                opt++;
            }
        }
        return opt;
    }
}
