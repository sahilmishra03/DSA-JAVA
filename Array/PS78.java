package Array;

public class PS78 {
    public static void main(String[] args) {
        int[] nums1 = { 2, 6, 4 };
        int[] nums2 = { 9, 7, 5 };

        System.out.println(addedInteger(nums1, nums2));
    }

    public static int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int index = 0; index < nums1.length; index++) {
            sum1 += nums1[index];
            sum2 += nums2[index];
        }

        int res = (sum2 - sum1) / nums1.length;

        return res;
    }
}
