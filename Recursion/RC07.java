package Recursion;

public class RC07 {
    public static void main(String[] args) {
        String s = "aabac";
        System.out.println(isPalindrom(s, 0, s.length() - 1));
    }

    static String removeA(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }

        String smallAns = removeA(s, idx + 1);

        char currentCharacter = s.charAt(idx);

        if (currentCharacter != 'a') {
            return currentCharacter + smallAns;
        } else {
            return smallAns;
        }
    }

    static String removeAV2(String s) {
        if (0 == s.length()) {
            return "";
        }

        String smallAns = removeAV2(s.substring(1));

        char currentCharacter = s.charAt(0);

        if (currentCharacter != 'a') {
            return currentCharacter + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverseString(String s, int idx) {
        if (idx == s.length()) {
            return "";
        }
        return reverseString(s, idx + 1) + s.charAt(idx);
    }

    static String reverseStringV2(String s) {
        if (0 == s.length()) {
            return "";
        }
        return reverseStringV2(s.substring(1)) + s.charAt(0);
    }

    static boolean isPalindrom(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && isPalindrom(s, l + 1, r - 1));
    }
}
