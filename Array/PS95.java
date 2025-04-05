package Array;

public class PS95 {
    public static void main(String[] args) {
        System.out.println(lcm(10, 12));
    }

    static int gcd(int x, int y) {
        int res = 0;
        if (x > y) {
            for (int i = x; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    res = i;
                    break;
                }
            }
        } else {
            for (int i = y; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }

    static int gcdV2(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int gcdV3(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    static int lcm(int x, int y) {
        return x * y / gcdV3(x, y);
    }
}