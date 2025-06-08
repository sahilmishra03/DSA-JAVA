package Recursion;

public class RC17 {
    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // downmove
        int countdown = countPath(i + 1, j, n, m);
        // rightmove
        int countright = countPath(i, j + 1, n, m);

        return countdown + countright;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(countPath(0, 0, n, m));
    }
}
