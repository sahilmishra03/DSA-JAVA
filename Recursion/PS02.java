package Recursion;

public class PS02 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 4, 1, 1 };
        int element = 4;
        int index = 0;
        System.out.println(m1(arr, element, index));
        System.out.println(m2(arr, element, index));
    }

    public static int m1(int[] arr, int data, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == data) {
            return index;
        } else {
            int res = m1(arr, data, index + 1);
            return res;
        }
    }

    public static int m2(int[] arr, int data, int index) {
        if (index == arr.length) {
            return -1;
        }
        int res = m2(arr, data, index + 1);
        if (res == -1) {
            if (arr[index] == data) {
                return index;
            } else {
                return -1;
            }
        } else {
            return res;
        }
    }
}
