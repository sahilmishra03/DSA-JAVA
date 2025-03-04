package HashMaps;

import java.util.HashSet;

public class PS08 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        System.out.println(hashSet.size());
    }
}
