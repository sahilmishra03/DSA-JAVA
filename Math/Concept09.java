//Check Prime Number

package Math;

public class Concept09 {
    public static void main(String[] args) {
        int num = 13;
        boolean flag = true;
        for (int i = 2; i < 10; i++) {
            if (num % i == 0 && num != i) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
