package Searching;

public class PS04 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        int res = 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long sqrt = (long) mid * mid;

            if (sqrt == x) {
                return mid;
            } else if (sqrt < x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}
