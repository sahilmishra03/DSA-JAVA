package HashMaps;

public class PS17 {
    public static void main(String[] args) {
        String textString = "leet code";
        String brokenLetters = "e";
        System.out.println(canBeTypedWords(textString, brokenLetters));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] strArray = text.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            boolean canType = true;
            for (int j = 0; j < strArray[i].length(); j++) {
                char c = strArray[i].charAt(j);
                for (int k = 0; k < brokenLetters.length(); k++) {
                    char x = brokenLetters.charAt(k);
                    if (c == x) {
                        canType = false;
                        break;
                    }
                }
                if (!canType) {
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }

        return count;
    }
}