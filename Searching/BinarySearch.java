package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int value = 20;
        System.out.println(binarySearch(nums, value));
    }

    public static int binarySearch(int[] nums, int value) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == value) {
                return mid;
            } else if (nums[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
