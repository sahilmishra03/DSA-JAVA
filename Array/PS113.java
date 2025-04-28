package Array;

public class PS113 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isThree(n));
    }

    public static boolean isThree(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res++;
            }
        }

        if (res == 3) {
            return true;
        }

        return false;
    }
}