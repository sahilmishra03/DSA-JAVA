package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS81 {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 8 };
        System.out.println(Arrays.toString(resultArray(nums)));
    }

    public static int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                arr1.add(nums[index]);
            } else if (index == 1) {
                arr2.add(nums[index]);
            } else {
                if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                    arr1.add(nums[index]);
                } else {
                    arr2.add(nums[index]);
                }
            }
        }
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < arr1.size(); i++) {
            res[index] = arr1.get(i);
            index++;
        }
        for (int i = 0; i < arr2.size(); i++) {
            res[index] = arr2.get(i);
            index++;
        }
        return res;
    }
}