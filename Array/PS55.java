package Array;

import java.util.ArrayList;

public class PS55 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        System.out.println(trimMean(arr));
    }

    public static double trimMean(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        ArrayList<Integer> helperArrayList = new ArrayList<>();
        for (int num : arr) {
            helperArrayList.add(num);
        }
        helperArrayList.remove(min);
        helperArrayList.remove(max);
        double sum = 0;
        for (int num : helperArrayList) {
            sum += num;
        }
        return sum / helperArrayList.size();
    }
}