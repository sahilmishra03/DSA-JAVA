package String;

public class PS23 {
    public static void main(String[] args) {
        String[] wordStrings = { "cd", "ac", "dc", "ca", "zz" };
        System.out.println(maximumNumberOfStringPairs(wordStrings));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder= new StringBuilder(words[i]);
            stringBuilder.reverse();
            String coString = stringBuilder.toString();
            for (int j = i + 1; j < words.length; j++) {
                if (coString.equals(words[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}
