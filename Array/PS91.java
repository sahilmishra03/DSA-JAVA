package Array;

import java.util.Arrays;

public class PS91 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(transformArray(arr)));
    }

    public static int[] transformArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] % 2 == 0) {
                res[i] = 0;
            } else {
                res[i] = 1;
            }
        }
        Arrays.sort(res);

        return res;
    }
}