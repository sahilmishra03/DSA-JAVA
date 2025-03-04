package Array;

public class PS29 {
    public static void main(String[] args) {
        int[] original = {1, 2};
        int m = 2, n = 2;

        PS29 obj = new PS29();
        int[][] result = obj.construct2DArray(original, m, n);

        if (result != null) {
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Cannot reshape array to the given dimensions.");
        }
    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] resultant = new int[m][n];
        int k = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultant[i][j] = original[k++];
            }
        }
        return resultant;
    }
}
