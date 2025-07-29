package Stack;

import java.util.*;

public class PS04 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                res[i] = map.get(nums[i]);
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    map.put(nums[i], nums[j]);
                    res[i] = nums[j];
                    break;
                }
            }
            if (res[i] == 0) {
                res[i] = -1;
            }
        }
        return res;
    }
}