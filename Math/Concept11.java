package Math;

public class Concept11 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }

        System.out.println(res);
    }
}
