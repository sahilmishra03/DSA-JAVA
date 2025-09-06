package Array;

public class PS176 {
    public static void main(String[] args) {
        int[][] grid = { { 2, 0, 0, 1 }, { 0, 3, 1, 0 }, { 0, 5, 2, 0 }, { 4, 0, 0, 2 } };

        System.out.println(checkXMatrix(grid));
    }

    public static boolean checkXMatrix(int[][] grid) {
        int cols = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == cols) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else if (j == grid[i].length - cols - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] > 0) {
                        return false;
                    }
                }
            }
            cols++;
        }

        return true;
    }
}
