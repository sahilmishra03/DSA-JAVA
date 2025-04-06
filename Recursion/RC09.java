package Recursion;

public class RC09 {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 40, 20 };
        System.out.println(frogJump(arr, 0));
    }

    static int frogJump(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return 0;
        }
        int op1 = Math.abs(arr[idx] - arr[idx + 1]) + frogJump(arr, idx + 1);
        if (idx == arr.length - 2) {
            return op1;
        }
        int op2 = Math.abs(arr[idx] - arr[idx + 2]) + frogJump(arr, idx + 2);
        return Math.min(op1, op2);
    }
}