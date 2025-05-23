package String;

import java.util.HashMap;
import java.util.Scanner;

public class PS63 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the first string");
        String s2 = sc.nextLine();

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if (hashMap1.containsKey(c1)) {
                hashMap1.put(c1, hashMap1.get(c1) + 1);
            } else {
                hashMap1.put(c1, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char c1 = s2.charAt(i);
            if (hashMap2.containsKey(c1)) {
                hashMap2.put(c1, hashMap2.get(c1) + 1);
            } else {
                hashMap2.put(c1, 1);
            }
        }
        boolean result = hashMap1.equals(hashMap2);
        System.out.println(result);
    }
}