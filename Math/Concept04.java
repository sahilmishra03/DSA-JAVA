//How to find power of the number

package Math;

public class Concept04 {
    public static void main(String[] args) {
        System.out.println(pow(2, 4));
    }

    public static int pow(int base, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res = base * base;
        }

        return res;
    }
}
