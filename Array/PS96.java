package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS96 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(index[i], nums[i]);
        }
        int res[] = new int[nums.length];
        int k = 0;
        for (int i : arrayList) {
            res[k++] = i;
        }
        return res;
    }
}
