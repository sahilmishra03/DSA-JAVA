package Array;

public class PS38 {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] * 2 > max) {
                return -1;
            }
        }
        return index;   
    }
}