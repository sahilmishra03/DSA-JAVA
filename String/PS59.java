package String;

public class PS59 {
    public static void main(String[] args) {

        String s = "a1c1e1";
        System.out.println(replaceDigits(s));
    }

    public static String replaceDigits(String s) {
        StringBuilder helper = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                char c1 = s.charAt(i);
                String shelp = String.valueOf(c1);
                int num = Integer.parseInt(shelp);
                int ascii = s.charAt(i - 1);
                char character = (char) (ascii + num);
                helper.append(character);
            } else {
                helper.append(s.charAt(i));
            }
        }
        return helper.toString();
    }
}
