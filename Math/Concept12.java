package Math;

public class Concept12 {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        int lcm = num1*num2/gcd(num1, num2);

        System.out.println(lcm);
    }

    public static int gcd(int num1,int num2){
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }

        return res;
    }
}
