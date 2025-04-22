package Array;

public class PS108 {
    public static void main(String[] args) {
        // Smallest Even Multiple
        int n = 9;
        for (int i = n; i <= 2 * n; i++) {
            if (i % 2 == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}