package Array;

import java.util.Scanner;

public class PS12 {
    public static void main(String[] args) {
        System.out.println("Enter the number of iteration you want to do");
        try (Scanner scanner = new Scanner(System.in)) {
            int iteration = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i <= iteration; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
