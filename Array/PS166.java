package Array;

public class PS166 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = "A man, a plan, a canal: Panama";
        String newString = s.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            if (((int) c >= 97 && (int) c <= 122) || ((int) c >= 65 && (int) c <= 90)) {
                stringBuilder.append(c);
            }
        }

        String s1 = stringBuilder.toString();
        String s2 = stringBuilder.reverse().toString();

        System.out.println(s1);
        System.out.println(s2);
    }
}