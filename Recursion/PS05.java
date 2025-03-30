package Recursion;

public class PS05 {
    public static void main(String[] args) {
        int num = 120540;
        System.out.println(zeroCount(num, 0));
    }

    static int zeroCount(int n, int count) {
        if (n == 0) {
            return count;
        }

        int rem = n % 10;

        if (rem == 0) {
            count++;
        }

        return zeroCount(n / 10, count);
    }
}