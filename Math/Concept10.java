package Math;

public class Concept10 {
    public static void main(String[] args) {
        int num = 40;

        for (int i = 1; i <= num; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < 10; i++) {
            if (num % i == 0 && num != i) {
                flag = false;
            }
        }

        return flag;
    }
}