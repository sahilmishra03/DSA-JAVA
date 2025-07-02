package Recursion;

public class RC20 {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    public static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int index = 0; index <= p.length(); index++) {
            String f = p.substring(0, index);
            String l = p.substring(index, p.length());
            permutations(f + ch + l, up.substring(1));
        }
    }
}