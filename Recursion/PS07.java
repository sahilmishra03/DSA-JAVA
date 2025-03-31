package Recursion;

public class PS07 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5 };
        System.out.println(sortedOrNot(arr, 0));
    }

    static boolean sortedOrNot(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i + 1] && sortedOrNot(arr, i + 1);
    }
}