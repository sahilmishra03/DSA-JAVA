package Array;

import java.util.HashMap;
import java.util.Set;

public class PS138 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 2, 2, 2 };
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        Set<Integer> set = hashMap.keySet();
        for (Integer integer : set) {
            if (hashMap.get(integer) % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}