//Count digits via log

package Math;

public class Concept07 {
    public static void main(String[] args) {
        int num = 15345;
        int value = (int) Math.log10(num) + 1;
        System.out.println(value);
    }
}
