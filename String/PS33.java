package String;

public class PS33 {
    public static void main(String[] args) {
        String[] words = { "leetcode", "win", "loops", "success" };
        String preString = "code";
        System.out.println(prefixCount(words, preString));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String string : words) {
            if (string.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}