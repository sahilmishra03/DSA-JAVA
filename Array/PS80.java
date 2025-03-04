package Array;

public class PS80 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 10 };
        System.out.println(canAliceWin(nums));
    }

    public static boolean canAliceWin(int[] nums) {
        int countOfsingleDigits = 0;
        int countOfdoubleDigits = 0;
        boolean res = false;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < 10) {
                countOfsingleDigits += nums[index];
            } else {
                countOfdoubleDigits += nums[index];
            }
        }
        if (countOfdoubleDigits != countOfsingleDigits) {
            res = true;
        }
        return res;
    }
}
