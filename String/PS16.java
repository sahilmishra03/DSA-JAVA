package String;

public class PS16 {
    public static void main(String[] args) {
        String word = "abcd";
        char ch = 'z';

        PS16 obj = new PS16();
        String result = obj.reversePrefix(word, ch);
        System.out.println("Result: " + result);
    }

    public String reversePrefix(String word, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = -1;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            stringBuilder.append(c);
            if (c == ch) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return word;
        } else {
            stringBuilder.reverse();
            for (int i = stringBuilder.length(); i < word.length(); i++) {
                stringBuilder.append(word.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
