package Recursion;

public class RC02 {
    public static void main(String[] args) {
        System.out.println(func4(2, 3));
    }

    static int func1(int n) {
        if (n < 10 && n >= 0) {
            return n;
        }
        return func1(n / 10) + n % 10;
    }

    static int func2(int n, int count) {
        if (n < 10 && n >= 0) {
            return count + 1;
        }
        return func2(n / 10, count + 1);
    }

    static int func3(int p, int q) {
        if (q == 0) {
            return 1;
        }
        return func3(p, q - 1) * p;
    }

    static int func4(int p, int q) {
        if (q == 0) {
            return 1;
        }
        if (q % 2 == 0) {
            return func4(p, q / 2) * func4(p, q / 2);
        } else {
            return func4(p, q / 2) * func4(p, q / 2) * p;
        }
    }
}