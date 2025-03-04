package Searching;

public class PS02 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return searchHelper(nums, 0, nums.length - 1, target);
    }

    private static int searchHelper(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchHelper(nums, left, mid - 1, target);
        } else {
            return searchHelper(nums, mid + 1, right, target);
        }
    }
}
