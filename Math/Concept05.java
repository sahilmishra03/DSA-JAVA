//Count Digits

package Math;

public class Concept05 {
    public static void main(String[] args) {
        int number = 123;
        int counter = 0;
        while (number > 0) {
            number /= 10;
            counter++;
        }

        System.out.println(counter);
    }
}
