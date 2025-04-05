package Recursion;

public class RC03 {
    public static void main(String[] args) {
        System.out.println(f2(5));
    }

    static void f(int n, int k) {
        if (k == 1) {
            System.out.print(n + " ");
            return;
        }
        f(n, k - 1);
        System.out.print(n * k + " ");
    }

    static int f1(int n) {
        if (n == 0) {
            return n;
        }
        return f1(n - 1) + n;
    }

    static int f2(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 2 == 0) {
            return f2(n - 1) - n;
        } else {
            return f2(n - 1) + n;
        }
    }
}
