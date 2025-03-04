package String;

public class PS50 {
    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        String res = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder st = new StringBuilder(words[i]);
            if (words[i].equals(st.reverse().toString())) {
                res = words[i];
                break;
            }
        }
        return res;
    }
}