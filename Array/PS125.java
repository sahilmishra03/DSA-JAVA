package Array;

public class PS125 {
    public static void main(String[] args) {
        String[] words = { "a", "aba", "ababa", "aa" };
        System.out.println(countPrefixSuffixPairs(words));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    result++;
                }
            }
        }
        return result;
    }

    public static boolean isPrefixAndSuffix(String s1, String s2) {
        if (s2.startsWith(s1) && s2.endsWith(s1)) {
            return true;
        }

        return false;
    }
}