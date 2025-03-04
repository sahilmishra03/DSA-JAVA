package Array;

public class PS16 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        int[] result = runningSum(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] helperArr = new int[nums.length];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            helperArr[index] = sum;
            index++;
        }
        return helperArr;
    }
}
