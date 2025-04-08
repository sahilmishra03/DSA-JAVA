package String;

import java.util.HashMap;
import java.util.Set;

public class PS58 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        System.out.println(maxFrequencyElements(nums));
    }

    public static int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        Set<Integer> set = hashMap.keySet();
        for (Integer integer : set) {
            if (hashMap.get(integer) > max) {
                max = hashMap.get(integer);
            }
        }

        int sum = 0;
        for (Integer integer : set) {
            if (hashMap.get(integer) == max) {
                sum += hashMap.get(integer);
            }
        }

        return sum;
    }
}
