package Array;

public class PS171 {
    public static void main(String[] args) {
        System.out.println(appendCharacters("z", "abcde"));
    }

    public static int appendCharacters(String s, String t) {
        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            while (j < t.length()) {
                char c2 = t.charAt(j);
                j++;
                if (c1 == c2) {
                    count++;
                    break;
                }
            }
        }
        return t.length()-count;
    }
}
