package Array;

import java.util.Arrays;

public class PS103 {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] res = new int[rows][cols];
        int row = 0;
        int col = 0;
        for (int i = 0; i < image.length; i++) {
            for (int j = image.length; j >= 0; j--) {
                if (image[i][j] == 0) {
                    res[row][col] = 1;
                    col++;
                } else {
                    res[row][col] = 0;
                    col++;
                }
            }
            row++;
        }
        return res;
    }
}
