package Recursion;

public class RC04 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 4, 3 };
        System.out.println(maxValue(arr, 0, 0));
    }

    static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);
    }

    static int maxValue(int[] arr, int index, int max) {
        if (index == arr.length) {
            return max;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        return maxValue(arr, index + 1, max);
    }

    static int maxValueV2(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int smallAns = maxValueV2(arr, index + 1);
        return Math.max(smallAns, arr[index]);
    }
}
