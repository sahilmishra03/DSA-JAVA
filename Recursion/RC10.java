package Recursion;

public class RC10 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 4, 4, 5, 6 };
        System.out.println(lastIndex(arr, 0, 0, 4));
    }

    static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        return (arr[idx] < arr[idx + 1] && isSorted(arr, idx + 1));
    }

    static int lastIndex(int[] arr, int idx, int res, int target) {
        if (idx == arr.length) {
            return res;
        }
        if (arr[idx] == target) {
            res = idx;
        }
        return lastIndex(arr, idx + 1, res, target);
    }
}
