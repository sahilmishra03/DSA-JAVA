package Array;

public class PS130 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int idx = 0;
        for (int i = 0; i < mat.length; i++) {
            int idx2 = mat.length - 1 - idx;
            if (idx == idx2) {
                res += mat[i][idx];
            } else {
                res += mat[i][idx];
                res += mat[i][idx2];
            }

            idx++;
        }

        return res;
    }
}