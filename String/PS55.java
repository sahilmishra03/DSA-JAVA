package String;

public class PS55 {
    public static void main(String[] args) {
        String string = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(string, k));
    }

    public static String reverseStr(String s, int k) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (count < k) {
                char c = s.charAt(i);
                String string = String.valueOf(c);
                stringBuilder.append(string);
                count++;
            }
        }
        stringBuilder.reverse();
        for (int i = k; i < s.length(); i++) {
            char c = s.charAt(i);
            String string = String.valueOf(c);
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }
}
