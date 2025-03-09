package Sorting;

public class MergeSort {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void conquer(int arr[], int si, int ei, int mid) {
        int merger[] = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;  // Corrected initialization
        int x = 0;

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merger[x++] = arr[indx1++];
            } else {
                merger[x++] = arr[indx2++];
            }
        }

        while (indx1 <= mid) {
            merger[x++] = arr[indx1++];
        }

        while (indx2 <= ei) {
            merger[x++] = arr[indx2++];
        }

        for (int i = 0, j = si; i < merger.length; i++, j++) {
            arr[j] = merger[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
