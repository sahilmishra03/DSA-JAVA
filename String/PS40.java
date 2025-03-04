package String;

import java.util.ArrayList;
import java.util.List;

public class PS40 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("$easy$");
        strings.add("$problem$");
        char separator = '$';
        System.out.println(splitWordsBySeparator(strings, separator));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> sList = new ArrayList<>();
        String string = String.valueOf(separator);
        for (int i = 0; i < words.size(); i++) {
            String[] strings = words.get(i).split("\\" + string);
            for (String string2 : strings) {
                if (!string2.isEmpty()) {
                    sList.add(string2);
                }
            }
        }
        return sList;
    }
}