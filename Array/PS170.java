package Array;

public class PS170 {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int count = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            while (j < t.length()) {
                char c2 = t.charAt(j);
                j++;
                if (c1 == c2) {
                    count++;
                    break;
                }
            }
        }

        if (count != s.length()) {
            return false;
        }

        return true;
    }
}
