package Recursion;

public class RC05 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 6, 6, 6 };
        System.out.println(function1(arr, 0));
    }

    static int function1(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return function1(arr, i + 1) + arr[i];
    }
}