package Array;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class PS41 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 3, 2 };
        int[] nums2 = { 2, 3 };
        int[] nums3 = { 3 };
        List<Integer> resuList = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(resuList);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> HashSet = new HashSet<>();
        List<Integer> rIntegers = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    HashSet.add(nums1[i]);
                }
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums2[i] == nums3[j]) {
                    HashSet.add(nums2[i]);
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums3.length; j++) {
                if (nums1[i] == nums3[j]) {
                    HashSet.add(nums1[i]);
                }
            }
        }
        for (Integer integer : HashSet) {
            rIntegers.add(integer);
        }
        return rIntegers;
    }
}
