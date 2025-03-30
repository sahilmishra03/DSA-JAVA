package Recursion;

public class PS02 {
    public static void main(String[] args) {
        fun3(5);
    }

    static void fun1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun1(n - 1);
    }

    static void fun2(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        fun2(n - 1);
        System.out.println(n);
    }

    static void fun3(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun3(n - 1);
        System.out.println(n);
    }
}