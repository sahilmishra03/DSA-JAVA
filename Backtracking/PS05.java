package Backtracking;

public class PS05 {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(gridWaysMaths(m, n));
    }

    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static int gridWaysMaths(int m, int n) {
        return factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1));
    }

    public static int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * factorial(num - 1);
    }
}
