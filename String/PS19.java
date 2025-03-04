package String;

public class PS19 {
    public static void main(String[] args) {
        String[] sentenceStrings = { "alice and bob love leetcode", "i think so too",
                "this is great thanks very much" };
                System.out.println(mostWordsFound(sentenceStrings));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            String[] w = sentences[i].split(" ");
            if (w.length > max) {
                max=w.length;
            }
        }
        return max;
    }
}
