package Recursion;

public class PS04 {
    public static void main(String[] args) {
        System.out.println(prod(123));
    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigit(n / 10);
    }

    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }

        return (n % 10) * prod(n / 10);
    }
}
