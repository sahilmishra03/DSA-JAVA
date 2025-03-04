package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS52 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = decompressRLElist(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> helperArrayList = new ArrayList<>();
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            for (int k = 0; k < nums[i]; k++) { 
                helperArrayList.add(nums[j]);
            }
            i = i + 2;
            j = j + 2;
        }

        int[] result = new int[helperArrayList.size()];
        int index = 0;
        for (Integer integer : helperArrayList) {
            result[index] = integer;
            index++;
        }
        return result;
    }
}
