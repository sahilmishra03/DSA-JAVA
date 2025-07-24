package Array;

import java.util.HashMap;
import java.util.Set;

public class PS156 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Set<Integer> set = map.keySet();

        for (Integer integer : set) {
            if (map.get(integer) == 1) {
                return integer;
            }
        }

        return -1;
    }
}
