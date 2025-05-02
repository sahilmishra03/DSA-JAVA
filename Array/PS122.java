package Array;

import java.util.HashSet;

public class PS122 {
    public static void main(String[] args) {
        int[] nums = { 1, 13, 10, 12, 31 };
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(nums[i]));
            stringBuilder.reverse();
            int addValue = Integer.parseInt(stringBuilder.toString());
            hashSet.add(addValue);
        }
        
        return hashSet.size();
    }
}