package Array;

import java.util.Arrays;
import java.util.HashSet;

public class PS59 {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 4, 0, 3, 5 };
        System.out.println(distinctAverages(nums));
    }

    public static int distinctAverages(int[] nums) {
        Float Avg = 0f;
        HashSet<Float> hashSet = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int firstIndex = nums[i];
            int lastIndex = nums[nums.length - 1 - i];
            Avg = (firstIndex + lastIndex) / 2.0f;
            hashSet.add(Avg);
        }
        return hashSet.size();
    }
}
