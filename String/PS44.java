package String;

public class PS44 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(thousandSeparator(n));
    }

    public static String thousandSeparator(int n) {
        String str = Integer.toString(n);
        StringBuilder builder = new StringBuilder();
        int len = str.length();
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (count > 0 && count % 3 == 0) {
                builder.append(".");
            }
            builder.append(str.charAt(i));
            count++;
        }
        return builder.reverse().toString();
    }
}