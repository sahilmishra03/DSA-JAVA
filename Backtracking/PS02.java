package Backtracking;

public class PS02 {
    public static void findSubsets(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // Recursion
        // Yes Choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // No Choice
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String s = "abc";
        findSubsets(s, "", 0);
    }
}