package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PS129 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1, 3, 2, 2 };
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }

    public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        int numberOfPairsValue = 0;
        Set<Integer> set = hashMap.keySet();
        for (Integer integer : set) {
            int addValue = hashMap.get(integer) / 2;
            numberOfPairsValue += addValue;
        }

        int result[] = new int[2];
        result[0] = numberOfPairsValue;
        result[1] = nums.length - numberOfPairsValue * 2;

        return result;
    }
}