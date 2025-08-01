package Array;

import java.util.Arrays;

public class PS160 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, idx = 0;
        int[] res = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                res[idx++] = nums1[i++];
            } else {
                res[idx++] = nums2[j++];
            }
        }

        while (i < m) {
            res[idx++] = nums1[i++];
        }

        while (j < n) {
            res[idx++] = nums2[j++];
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = res[k];
        }
    }

}
