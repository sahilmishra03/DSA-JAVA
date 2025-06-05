package Recursion;

public class RC11 {
    public static void main(String[] args) {
        System.out.println(calPower(2, 5));
        System.out.println(calPowerV2(2, 5));
    }

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        return x * calPower(x, n - 1);
    }

    public static int calPowerV2(int x, int n) {// log(n)
        if (n == 0) {
            return 1;
        }

        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return calPowerV2(x, n / 2) * calPowerV2(x, n / 2);
        }

        return calPowerV2(x, n / 2) * calPowerV2(x, n / 2) * x;
    }
}
