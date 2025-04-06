package Recursion;

import java.util.ArrayList;

public class RC06 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5, 6 };
        System.out.println(linearSearchV4(arr, 3, 0));
    }

    static boolean linearSearch(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return false;
        }
        if (arr[idx] == target) {
            return true;
        }
        return linearSearch(arr, target, idx + 1);
    }

    static int linearSearchV2(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return linearSearchV2(arr, target, idx + 1);
    }

    static void linearSearchV3(int[] arr, int target, int idx) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        linearSearchV3(arr, target, idx + 1);
    }

    static ArrayList<Integer> linearSearchV4(int[] arr, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx == arr.length) {
            return ans;
        }
        if (arr[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = linearSearchV4(arr, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
}