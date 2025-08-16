package Array;

public class PS168 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int res = num;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '6') {
                sb.setCharAt(i, '9');
                int valuecheck = Integer.parseInt(sb.toString());
                res = Math.max(res, valuecheck);
                sb.setCharAt(i, '6');
            }
        }
        return res;
    }
}
