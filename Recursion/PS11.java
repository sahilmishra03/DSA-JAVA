package Recursion;

public class PS11 {
    public static void main(String[] args) {
        String s = "bdappleappcd";
        String res = "";
        System.out.println(skipA(s, res));
        System.out.println(skipA2(s));
        System.out.println(skipApple(s));
        System.out.println(skipApple(s));
        System.out.println(skipAppNotApple(s));
    }

    static String skipA(String s, String res) {
        if (s.isEmpty()) {
            return res;
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            return skipA(s.substring(1), res);
        } else {
            return skipA(s.substring(1), res + ch);
        }
    }

    static String skipA2(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);

        if (ch == 'a') {
            return skipA2(s.substring(1));
        } else {
            return ch + skipA2(s.substring(1));
        }
    }

    static String skipApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skipApple(s.substring(5));
        } else {
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }

    static String skipAppNotApple(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")) {
            return skipAppNotApple(s.substring(3));
        } else {
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}