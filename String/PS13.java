package String;

public class PS13 {
    public static void main(String[] args) {
        String[] s1 = { "ab", "c" };
        String[] s2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(s1, s2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = stringConcatenation(word1);
        String w2 = stringConcatenation(word2);
        return w1.equals(w2);
    }

    public static String stringConcatenation(String[] wordStrings) {
        StringBuilder s = new StringBuilder();
        for (String word : wordStrings) {
            s.append(word);
        }
        return s.toString();
    }
}