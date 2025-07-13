// Binary to Decimal Conversion

package Math;

public class Concept02 {
    public static void main(String[] args) {
        int binaryNum = 101;
        int res = 0;
        int power = 0;

        while (binaryNum > 0) {
            int rem = binaryNum % 10;
            double valueOfBit = rem * Math.pow(2, power);
            res += valueOfBit;
            power++;
            binaryNum /= 10;
        }

        System.out.println("Decimal: " + res);
    }
}
