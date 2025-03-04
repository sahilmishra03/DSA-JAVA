package String;

public class PS15 {
    public static void main(String[] args) {
        String string = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s1);
        stringBuilder.reverse();
        String s2 = stringBuilder.toString();
        return s1.equals(s2);
    }
}
