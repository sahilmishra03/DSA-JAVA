package Array;

import java.util.Arrays;

public class PS53 {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int[] replaceElements = new int[arr.length];
        for (int i = 0; i < replaceElements.length; i++) {
            int max = Integer.MIN_VALUE;
            if (i == arr.length - 1) {
                replaceElements[i] = -1;
                break;
            }
            for (int j = i + 1; j < replaceElements.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            replaceElements[i] = max;
        }
        return replaceElements;
    }
}