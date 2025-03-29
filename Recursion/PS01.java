package Recursion;

public class PS01 {
    public static void main(String[] args) {
        // Fibonacci Number
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}