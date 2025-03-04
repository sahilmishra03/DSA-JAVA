package String;

public class PS48 {
    public static void main(String[] args) {
        String[] words = { "a", "b", "c", "ab", "bc", "abc" };
        String s = "abc";
        System.out.println(countPrefixes(words, s));
    }

    public static int countPrefixes(String[] words, String s) {
        int countPrefixesINT = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (s.startsWith(word)) {
                countPrefixesINT++;
            }
        }
        return countPrefixesINT;
    }
}
