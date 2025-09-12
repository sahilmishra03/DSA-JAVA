package Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 7, 2, 6, 4, 9, 8, 1, 5 };
        mergeSortHelper(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void mergeSortHelper(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortHelper(arr, start, mid);
        mergeSortHelper(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p1 = start, p2 = mid + 1, p3 = 0;

        while (p1 <= mid && p2 <= end) {
            if (arr[p1] < arr[p2]) {
                temp[p3++] = arr[p1++];
            } else {
                temp[p3++] = arr[p2++];
            }
        }

        while (p1 <= mid) {
            temp[p3++] = arr[p1++];
        }

        while (p2 <= end) {
            temp[p3++] = arr[p2++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }
}
