package Stack;

import java.util.Arrays;

public class PS14 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        int res[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int idx = 0;

        while (i <= j) {
            if (i == j) {
                res[idx] = nums[i];
                idx++;
            } else {
                res[idx] = nums[i];
                idx++;
                res[idx] = nums[j];
                idx++;
            }
            i++;
            j--;
        }

        System.out.println(Arrays.toString(res));
    }
}
