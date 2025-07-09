package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PS146 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        threeSumHelper(nums, set);
        return new ArrayList<>(set);
    }

    public static void threeSumHelper(int[] nums, HashSet<List<Integer>> set) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.sort(null);
                        set.add(list);
                    }
                }
            }
        }
    }
}
