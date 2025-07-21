package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PS153 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    for (int d = c + 1; d < nums.length; d++) {
                        if ((long) nums[a] + nums[b] + nums[c] + nums[d] == target) {
                            List<Integer> addValue = new ArrayList<>();
                            addValue.add(nums[a]);
                            addValue.add(nums[b]);
                            addValue.add(nums[c]);
                            addValue.add(nums[d]);
                            Collections.sort(addValue);
                            if (!res.contains(addValue)) {
                                res.add(addValue);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
