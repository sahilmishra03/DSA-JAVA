package Array;

import java.util.Arrays;

public class PS179 {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 3, 4 };
        System.out.println(findKRotation(arr));
    }

    public static int findKRotation(int arr[]) {
        // Code here
        int copyArr[] = arr.clone();
        Arrays.sort(arr);

        int i = 0;
        int j = 0;

        int count = 0;

        while (i < arr.length && j < copyArr.length) {
            if (arr[i] != copyArr[j]) {
                count++;
                j++;
            } else {
                i++;
                j++;
            }
        }

        return count;
    }
}