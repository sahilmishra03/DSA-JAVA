package Array;

import java.util.Arrays;

public class PS104 {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 4, 1 };
        int indexDifference = 2;
        int valueDifference = 4;
        System.out.println(Arrays.toString(findIndices(nums, indexDifference, valueDifference)));
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int res[] = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    res[0] = i;
                    res[1] = j;
                    index++;
                    break;
                }
            }
        }

        if (index == 0) {
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}
