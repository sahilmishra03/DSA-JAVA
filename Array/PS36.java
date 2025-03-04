package Array;

import java.util.*;

public class PS36 {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 4, 4, 1 };
        System.out.println(mostFrequentEven(nums));
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (hMap.containsKey(nums[i])) {
                    hMap.put(nums[i], hMap.get(nums[i]) + 1);
                } else {
                    hMap.put(nums[i], 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int res = -1;
        Set<Integer> sIntegers = hMap.keySet();
        for (Integer integer : sIntegers) {
            if (hMap.get(integer) > max || (hMap.get(integer) == max && integer < res)) {
                max = hMap.get(integer);
                res = integer;
            }
        }
        return res;
    }

}