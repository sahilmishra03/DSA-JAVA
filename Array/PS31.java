package Array;

import java.util.HashSet;

public class PS31 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        Integer[] res = set.toArray(new Integer[set.size()]);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
