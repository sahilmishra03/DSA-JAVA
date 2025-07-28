package Searching;

import java.util.Arrays;

public class PS03 {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];

        res[0] = findFirstPostion(nums, target);
        res[1] = findLastPostion(nums, target);

        return res;
    }

    private static int findLastPostion(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstidx = -1;

        while (left <= right) {
            int mid = right - left / 2;

            if (nums[mid] == target) {
                firstidx = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstidx;
    }

    private static int findFirstPostion(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lasttidx = -1;

        while (left <= right) {
            int mid = right - left / 2;

            if (nums[mid] == target) {
                lasttidx = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lasttidx;
    }
}
