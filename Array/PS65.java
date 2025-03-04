package Array;

public class PS65 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 1, 6 };
        System.out.println(isArraySpecial(nums));
    }

    public static boolean isArraySpecial(int[] nums) {
        Boolean resBoolean = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && nums[i - 1] % 2 != 0 || nums[i] % 2 != 0 && nums[i - 1] % 2 == 0) {
                resBoolean = true;
            }else{
                return false;
            }
        }
        return resBoolean;
    }
}
