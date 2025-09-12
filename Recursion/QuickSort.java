package Recursion;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 6, 3, 0, 8, 4 };
        quickSortFunction(arr, 0, arr.length - 1);

        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void quickSortFunction(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);
        quickSortFunction(arr, start, pivot - 1);
        quickSortFunction(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivotElement = arr[end];
        int i = start;

        for (int j = start; j <= end; j++) {
            if (arr[j] < pivotElement) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }
}
