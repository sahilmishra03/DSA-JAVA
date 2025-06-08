package Recursion;

public class RC16 {
    public static void printPerm(String s, String permutation) {
        if (s.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i + 1);
            printPerm(newString, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}