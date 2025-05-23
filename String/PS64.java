package String;

import java.util.Scanner;

public class PS64 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        int arr[] = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            int addValue = Integer.parseInt(String.valueOf(value.charAt(i)));
            arr[i] = addValue;
        }

        int evenPlace = 0;
        int oddPlace = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPlace += arr[i];
            } else {
                oddPlace += arr[i];
            }
        }
        boolean result = false;
        if (evenPlace > oddPlace) {
            if ((evenPlace - oddPlace) % 11 == 0) {
                result = true;
            }
        } else {
            if ((oddPlace - evenPlace) % 11 == 0) {
                result = true;
            }
        }

        System.out.println(result);
    }
}
