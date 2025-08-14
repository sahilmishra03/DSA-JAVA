package Array;

public class PS167 {
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num) {
        if (num.length() < 3)
            return "";
        String res = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length() - 2; i++) {
            char c1 = num.charAt(i);
            char c2 = num.charAt(i + 1);
            char c3 = num.charAt(i + 2);

            if (c1 == c2 && c2 == c3) {
                StringBuilder sb = new StringBuilder("");
                sb.append(c1);
                sb.append(c2);
                sb.append(c3);
                int value = Integer.parseInt(sb.toString());
                if (value > max) {
                    max = value;
                    res = sb.toString();
                }
            }
        }
        return res;
    }
}