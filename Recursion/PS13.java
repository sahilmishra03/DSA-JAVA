package Recursion;

public class PS13 {
    public static void main(String[] args) {
        String s = "abc";
        String res = "";
        subseqAscii(res, s);
    }

    static void subseqAscii(String r, String s) {
        if (s.isEmpty()) {
            System.out.println(r);
            return;
        }

        char c = s.charAt(0);

        subseqAscii(r + c, s.substring(1));
        subseqAscii(r, s.substring(1));
        subseqAscii(r + (c + 0), s.substring(1));
    }
}
