package String;

import java.util.ArrayList;
import java.util.List;

public class PS32 {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("alice");
        sList.add("bob");
        sList.add("charlie");
        String string = "abc";
        System.out.println(isAcronym(sList, string));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            String string = words.get(i);
            char c = string.charAt(0);
            stringBuilder.append(c);
        }
        if (stringBuilder.toString().equals(s)) {
            return true;
        }
        return false;
    }
}