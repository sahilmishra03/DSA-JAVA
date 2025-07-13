// Count the Digits That Divide a Number

package Math;

public class Concept06 {
    public static void main(String[] args) {
        int num = 121;

        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        int value = num;
        int counter = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem != 0 && value % rem == 0) {
                counter++;
            }

            num /= 10;
        }

        return counter;
    }
}
