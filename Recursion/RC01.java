package Recursion;

public class RC01 {
    public static void main(String[] args) {
        System.out.println(fun4(5));
    }

    static void fun1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        fun1(n - 1);
        System.out.println(n);
    }

    static void fun2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        fun2(n - 1);
    }

    static int fun3(int n) {
        if (n == 0) {
            return 1;
        }
        int smallAns = fun3(n - 1);

        return n * smallAns;
    }

    static int fun4(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fun4(n - 1) + fun4(n - 2);
    }
}