package Pattern;

public class CW02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 5; x >= 1; x--) {
            for (int y = x+1; y <= 5; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x - 1); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
