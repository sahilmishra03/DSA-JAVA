package Array;

import java.util.*;

public class PS48 {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int[] numsResult = sortArrayByParity(nums);
        System.out.println(Arrays.toString(numsResult));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] numsResult = new int[nums.length];
        int index = 0;
        int LastIndex = nums.length-1;
        for (int i = 0; i < numsResult.length; i++) {
            if (nums[i]%2==0) {
                numsResult[index]=nums[i];
                index++;
            }else{
                numsResult[LastIndex]=nums[i];
                LastIndex--;
            }
        }
        return numsResult;
    }
}
