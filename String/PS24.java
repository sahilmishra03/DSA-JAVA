package String;

import java.util.ArrayList;
import java.util.List;

public class PS24 {
    public static void main(String[] args) {
        String[] wordStrings = { "leet", "code" };
        char c = 'e';
        System.out.println(findWordsContaining(wordStrings, c));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list= new ArrayList<>();
        String c = String.valueOf(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(c)) {
                list.add(i);
            }
        }
        return list;
    }
}