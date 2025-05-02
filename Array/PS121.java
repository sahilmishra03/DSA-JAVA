package Array;

public class PS121 {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int[][] resultArray = new int[matrix.length][matrix.length];
        resultArray = helperRotate(matrix, resultArray);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = resultArray[i][j];
            }
        }
    }

    public static int[][] helperRotate(int[][] matrix, int[][] resultArray) {
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                resultArray[j][matrix[i].length - 1 - i] = matrix[i][j];
            }
        }

        return resultArray;
    }

}