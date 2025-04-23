package Array;

public class PS109 {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = String.valueOf(x);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                stringBuilder.append(s.charAt(i));
            }
        }

        if (s.charAt(0) == '-') {
            stringBuilder.insert(0, '-');
        }

        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
