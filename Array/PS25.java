package Array;

import java.util.*;

public class PS25 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
        System.out.println(optimalfindDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result = nums[i];
                }
            }
        }
        return result;
    }

    public static int optimalfindDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
