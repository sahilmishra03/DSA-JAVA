package Array;

import java.util.ArrayList;
import java.util.List;

public class PS107 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isValid(matrix, i, j, matrix[i][j])) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }

    private static boolean isValid(int[][] matrix, int row, int col, int digit) {
        for (int i = 0; i < matrix.length; i++) {
            if (digit < matrix[i][col]) {
                return false;
            }
        }

        for (int j = 0; j < matrix[row].length; j++) {
            if (digit > matrix[row][j]) {
                return false;
            }
        }

        return true;
    }
}
