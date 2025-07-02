package Recursion;

public class RC19 {
    public static void main(String[] args) {
        func(5);
    }

    public static void func(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        func(n - 1);
        System.out.println(n);
    }
}