package Recursion;

public class RC13 {
    public static void main(String[] args) {
        subsets("abc", 0, "");
    }

    public static void subsets(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char c = str.charAt(idx);

        // pick
        subsets(str, idx + 1, newString + c);
        // No pick
        subsets(str, idx + 1, newString);
    }
}
