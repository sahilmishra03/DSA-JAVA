package Array;

import java.util.Arrays;

public class PS131 {
    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 0, 1 } };
        System.out.println(Arrays.toString(onesMinusZeros(grid)));
    }

    public static int[][] onesMinusZeros(int[][] grid) {
        int[][] result = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int value = diffValue(grid, i, j);

                result[i][j] = value;
            }
        }

        return result;
    }

    public static int diffValue(int[][] grid, int i, int j) {
        int onesRowi = 0;
        int onesColj = 0;
        int zerosRowi = 0;
        int zerosColj = 0;

        for (int k = 0; k < grid[0].length; k++) {
            if (grid[i][k] == 1) {
                onesRowi++;
            } else {
                zerosRowi++;
            }
        }

        for (int k = 0; k < grid.length; k++) {
            if (grid[k][j] == 1) {
                onesColj++;
            } else {
                zerosColj++;
            }
        }

        return onesRowi + onesColj - zerosRowi - zerosColj;
    }
}
