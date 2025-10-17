package Searching;

public class PS11 {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 10, 10, 10, 18, 19, 20 };
        int target = 10;
        int result = binarySearch(arr, target);
        System.out.println("Count occurrence of " + target + " is: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        if (firstIndex == -1 || lastIndex == -1) {
            return 0; // Target not found
        }

        return lastIndex - firstIndex + 1;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
