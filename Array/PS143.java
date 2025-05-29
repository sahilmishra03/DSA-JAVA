package Array;

import java.util.Arrays;

public class PS143 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 1 }, { 2, 3 } };
        System.out.println(Arrays.toString(sumEvenAfterQueries(nums, queries)));
    }

    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] result = new int[nums.length];
        for (int i = 0; i < queries.length; i++) {
            nums[queries[i][1]] = nums[queries[i][1]]+ queries[i][0];
            int addValueToNewArray = evenValueOfArray(nums);
            result[i] = addValueToNewArray;
        }
        return result;
    }

    public static int evenValueOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
