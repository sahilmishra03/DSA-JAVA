package Array;

import java.util.ArrayList;
import java.util.List;

public class PS106 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 9, 1, 3, 9, 5 };
        int key = 9;
        int k = 1;
        System.out.println(findKDistantIndices(nums, key, k));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

}
