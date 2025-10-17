package Searching;

public class PS09 {
    public static void main(String[] args) {
        int[] arr = {12, 10, 5, 3, 1, 0, -1, -3, -5, -7 };
        int target = 1;
        int result = binarySearch(arr, target);
        System.out.println("Target found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 1) {
            if (arr[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        if (arr[0] < arr[1]) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        } else {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}
