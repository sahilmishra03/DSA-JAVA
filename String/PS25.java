package String;

public class PS25 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        String[] strArray = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i < k - 1)
                builder.append(strArray[i] + " ");
            else
                builder.append(strArray[i]);
        }
        return builder.toString();
    }
}