package Array;

public class PS28 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        int[][] result = modifiedMatrix(nums);
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}
