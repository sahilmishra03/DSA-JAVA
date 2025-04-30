package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS120 {
    public static void main(String[] args) {
        int nums[] = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positiveIntegers = new ArrayList<>();
        ArrayList<Integer> negativeIntegers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negativeIntegers.add(nums[i]);
            } else {
                positiveIntegers.add(nums[i]);
            }
        }

        int[] resultArray = new int[nums.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < positiveIntegers.size() || j < negativeIntegers.size()) {
            resultArray[k] = positiveIntegers.get(i);
            k = k + 1;
            i = i + 1;
            resultArray[k] = negativeIntegers.get(j);
            k = k + 1;
            j = j + 1;
        }

        return resultArray;
    }
}