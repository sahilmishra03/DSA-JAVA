package Searching;

public class PS01 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        return findPeakElementHelper(nums, 0, nums.length - 1);
    }

    private static int findPeakElementHelper(int[] nums, int left, int right) {
        if (left == right) {
            return left;
        }

        int mid = (left + right) / 2;

        if (nums[mid] > nums[mid + 1]) {
            return findPeakElementHelper(nums, left, mid);
        } else {
            return findPeakElementHelper(nums, mid + 1, right);
        }
    }
}
