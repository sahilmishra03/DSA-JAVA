package Math;

public class Concept15 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        double res = 1;
        int exp = Math.abs(n);

        for (int i = 0; i < exp; i++) {
            res *= x;
        }

        if (n < 0) {
            return 1 / res;
        }

        return res;
    }
}
