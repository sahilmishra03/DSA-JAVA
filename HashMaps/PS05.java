package HashMaps;

import java.util.*;

public class PS05 {
    public static void main(String[] args) {
        int nums[] = { 5, 1, 5, 2, 5, 3, 5, 4 };
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int res = -1;
        Set<Integer> iraSet = hashMap.keySet();
        for (Integer integer : iraSet) {
            if (max<hashMap.get(integer)) {
                max=hashMap.get(integer);
                res = integer;
            }
        }
        return res;
    }
}