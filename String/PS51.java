package String;

public class PS51 {
    public static void main(String[] args) {
        String s = "aAbBcC";
        System.out.println(countKeyChanges(s));
    }

    public static int countKeyChanges(String s) {
        String string = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < string.length() - 1; i++) {
            char c1 = string.charAt(i);
            char c2 = string.charAt(i + 1);
            if (c1 != c2) {
                count++;
            }
        }
        return count;
    }
}