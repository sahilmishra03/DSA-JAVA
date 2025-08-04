package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class PS162 {
    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        System.out.println(fourSum(nums, 0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> addList = new ArrayList<>();
                        addList.add(nums[i]);
                        addList.add(nums[j]);
                        addList.add(nums[k]);
                        addList.add(nums[l]);

                        set.add(addList);

                        k++;
                        l--;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
