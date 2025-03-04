package HashMaps;

import java.util.HashSet;

public class PS13 {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 1, 1 };
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) {
                duplicates.add(nums[i]);
            } else {
                hashSet.add(nums[i]);
            }
        }
        hashSet.removeAll(duplicates);
        int sumOfUnique = 0;
        for (Integer integer : hashSet) {
            sumOfUnique += integer;
        }
        
        return sumOfUnique;
    }
}
