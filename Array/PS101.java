package Array;

public class PS101 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int hi = rows * cols - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
