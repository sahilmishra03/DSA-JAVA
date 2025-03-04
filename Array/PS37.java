package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PS37 {
    public static void main(String[] args) {
        int nums[] = { 1,2,5,2,3};
        System.out.println("List: " + targetIndices(nums, 5));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> rIntegers = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                rIntegers.add(i);
            }
        }
        return rIntegers;
    }
}
