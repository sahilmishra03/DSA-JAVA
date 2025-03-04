package Array;

public class PS07 {
    public static void main(String[] args) {
        String string = "Aabaa";
        String newString = string.toLowerCase();
        String r = "";
        char ch;

        for (int i = 0; i < newString.length(); i++) {
            ch = newString.charAt(i);
            r = ch + r;
        }
        if (newString.equals(r)) {
            System.out.println("IT IS A PALINDROME");
        } else {
            System.out.println("IT IS NOT A PALINDROME");
        }
    }
}
