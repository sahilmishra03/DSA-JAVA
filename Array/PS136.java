package Array;

import java.util.Arrays;

public class PS136 {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 2 };
        int[] nums2 = { 1, 2 };
        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    cnt1++;
                    break;
                }
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    cnt2++;
                    break;
                }
            }
        }

        int res[] = new int[2];
        res[0] = cnt1;
        res[1] = cnt2;

        return res;
    }
}
