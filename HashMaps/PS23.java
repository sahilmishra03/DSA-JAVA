package HashMaps;

import java.util.HashSet;

public class PS23 {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        for (Integer integer : set) {
            return integer;
        }

        return -1;
    }
}
