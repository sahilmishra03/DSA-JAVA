package Array;

public class PS123 {
    public static void main(String[] args) {
        String[] nums = { "777", "7", "77", "77" };
        System.out.println(numOfPairs(nums, "7777"));
    }

    public static int numOfPairs(String[] nums, String target) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                String check = nums[i] + nums[j];
                if (check.equals(target) && i != j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
