package Array;

public class PS116 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumOfMultiples(n));
    }

    public static int sumOfMultiples(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                output += i;
            }
        }
        return output;
    }
}
