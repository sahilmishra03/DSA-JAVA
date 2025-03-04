package String;

public class PS39 {
    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        System.out.println(reverseWords(string));
    }

    public static String reverseWords(String s) {
        String[] strings=s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(strings[i]);
            strings[i]=stringBuilder.reverse().toString();
        }
        return String.join(" ", strings);
    }
}
