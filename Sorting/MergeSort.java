package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 22, 43, 11, 51, 67 };
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        // Base case: return single-element or empty arrays
        if (low == high) {
            return new int[] { arr[low] };
        }

        // Correct mid calculation
        int mid = low + (high - low) / 2;

        // Recursive calls for left and right halves
        int[] lo = mergeSort(arr, low, mid);
        int[] hi = mergeSort(arr, mid + 1, high);

        // Merge the two sorted halves
        return mergeTwoSortedArray(lo, hi);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0, i = 0, j = 0;

        // Merge elements while comparing from both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }

        // Add remaining elements from arr1
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }

        return arr3;
    }
}