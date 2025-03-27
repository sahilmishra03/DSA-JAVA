package Array;

public class PS86 {
    public static void main(String[] args) {
        String[] words = { "are", "amy", "u" };
        System.out.println(vowelStrings(words, 0, 2));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            String s = words[i].toLowerCase();
            char c1 = s.charAt(0);
            char c2 = s.charAt(s.length() - 1);

            if ((c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') &&
                (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')) {
                count++;
            }
        }

        return count;
    }
}
