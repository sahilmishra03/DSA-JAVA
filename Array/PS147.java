package Array;

import java.util.Arrays;

public class PS147 {
    public static void main(String[] args) {
        int[][] matrixs = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrixs);

        for (int[] arr : matrixs) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int[][] matrixCopy = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixCopy[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrixCopy.length; i++) {
            for (int j = 0; j < matrixCopy[i].length; j++) {
                if (matrixCopy[i][j] == 0) {
                    helperFunction(i, j, matrix);
                }
            }
        }
    }

    public static void helperFunction(int row, int col, int[][] resMatrix) {
        for (int i = 0; i < resMatrix[0].length; i++) {
            resMatrix[row][i] = 0;
        }

        for (int i = 0; i < resMatrix.length; i++) {
            resMatrix[i][col] = 0;
        }
    }
}
