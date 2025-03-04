package Recursion;

public class PS01 {
    public static void main(String[] args) {
        // m1();
        // m2(1);
        // m3(1);
        // System.out.println(m4(5));
    }

    public static void m1() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }

    public static void m2(int n) {
        System.out.println(n);
        if (n == 5) {
            return;
        }
        m2(++n);
    }

    public static void m3(int n) {
        if (n == 6) {
            return;
        }
        m3(++n);
        System.out.println(n - 1);
    }

    public static int m4(int n) {
        if (n == 0) {
            return 1;
        }
        return n * m4(n - 1);
    }
}
