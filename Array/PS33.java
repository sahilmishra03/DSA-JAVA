package Array;

import java.util.Arrays;

public class PS33 {
    public static void main(String[] args) {
        int nums1[] = { 1, 3 };
        int nums2[] = { 2 };
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] newArray = new int[l1 + l2];
        System.arraycopy(nums1, 0, newArray, 0, l1);
        System.arraycopy(nums2, 0, newArray, l1, l2);
        Arrays.sort(newArray);
        double median = 0;
        if (newArray.length % 2 == 0) {
            int mid1 = newArray.length / 2 - 1;
            int mid2 = newArray.length / 2;
            median = (newArray[mid1] + newArray[mid2]) / 2.0;
        } else {
            int mid = newArray.length / 2;
            median = newArray[mid];
        }
        System.out.println(median);
    }
}
