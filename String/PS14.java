package String;

public class PS14 {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        StringBuilder hBuilder = new StringBuilder(s1);
        hBuilder.reverse();
        String s2 = hBuilder.toString();
        if (s1.equals(s2)) {
            return true;
        } 
        return false;
    }
}