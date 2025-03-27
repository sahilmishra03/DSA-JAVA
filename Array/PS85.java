package Array;

import java.util.Arrays;

public class PS85 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }

        for (int i = n; i < nums.length; i++) {
            arr2[i - n] = nums[i];
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < n; i++) {
            res[2 * i] = arr1[i];
            res[2 * i + 1] = arr2[i];
        }

        return res;
    }
}   