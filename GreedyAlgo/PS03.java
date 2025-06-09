package GreedyAlgo;

import java.util.Arrays;

public class PS03 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3 };
        int[] B = { 2, 1, 3 };
        System.out.println(minAbsoluteDifference(A, B));
    }

    public static int minAbsoluteDifference(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            result = Math.min(result, Math.abs(A[i] - B[i]));
        }

        return result;
    }
}