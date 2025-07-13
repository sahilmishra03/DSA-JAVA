// Decimal to Binary Conversion

package Math;

public class Concept01 {
    public static void main(String[] args) {
        int decimalNum = 5;
        int res = 0;
        int power = 0;

        while (decimalNum > 0) {
            int rem = decimalNum % 2;
            decimalNum /= 2;
            res += rem * Math.pow(10, power);
            power++;
        }

        System.out.println(res);
    }
}
