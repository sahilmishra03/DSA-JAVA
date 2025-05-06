package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PS126 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> helperHashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (helperHashSet.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                helperHashSet.add(nums[i]);
            }
        }
        return list;
    }
}
