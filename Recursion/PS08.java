package Recursion;

public class PS08 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 4, 0));
    }

    static int search(int[] arr, int target, int i) {
        if (target == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, target, i + 1);
    }
}