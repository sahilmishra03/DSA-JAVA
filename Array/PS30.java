package Array;

public class PS30 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }

    public static int differenceOfSum(int[] nums) {
        int mainArraySum = 0;
        int digitsum=0;
        for (int i = 0; i < nums.length; i++) {
            mainArraySum += nums[i];
            int sum = 0;
            String s = String.valueOf(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                char numberS = s.charAt(j);
                int numberInt = Integer.parseInt(String.valueOf(numberS));
                sum += numberInt;
            }
            digitsum+=sum;
        }
        int difference = mainArraySum - digitsum;
        return difference;
    }
}
