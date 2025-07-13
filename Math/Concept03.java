//Reverse Integer

package Math;

public class Concept03 {
    public static void main(String[] args) {
        int number = 123;
        int res = 0;

        while (number > 0) {
            int rem = number % 10;
            res = res * 10 + rem;
            number /= 10;
        }

        System.out.println(res);
    }
}
