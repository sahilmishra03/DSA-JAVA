package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PS175 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int value = nums[i] + nums[j] + nums[k] + nums[l];
                    if (value == 0) {
                        // List<Integer> addList = new ArrayList<>();
                        // addList.add(nums[i]);
                        // addList.add(nums[j]);
                        // addList.add(nums[k]);
                        // set.add(addList);
                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                    } else if (value < 0) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();

        res.addAll(set);

        return res;
    }
}