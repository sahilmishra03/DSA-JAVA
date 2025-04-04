package Recursion;

public class RC01 {
    public static void main(String[] args) {
        fun2(5);
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
}