package Searching;

public class PS08 {
    public static void main(String[] args) {
        int[] nums = { 12, 10, 5, 3, 1, 0, -1, -3, -5, -7 };
        System.out.println(search(nums, -3));
    }

    public static int search(int[] nums, int value) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == value) {
                return mid;
            } else if (nums[mid] < value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
