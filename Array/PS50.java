package Array;

public class PS50 {
    public static void main(String[] args) {
        int[] nums = { 555,901,482,1771 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int countNumsWithEvenDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            int countDigit = 0;
            String s = String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                countDigit++;
            }
            if (countDigit % 2 == 0) {
                countNumsWithEvenDigits++;
            }
        }
        return countNumsWithEvenDigits;
    }
}
