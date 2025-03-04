package String;

import java.util.ArrayList;
import java.util.Arrays;

public class PS10 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        ArrayList<String> s1 = convert(s);
        ArrayList<String> s2 = convert(t);

        for (int i = 0; i < s2.size(); i++) {
            if (i < s1.size() && s1.get(i).equals(s2.get(i))) {
                continue;
            } else {
                return s2.get(i).charAt(0);
            }
        }

        return s2.get(s2.size() - 1).charAt(0);
    }

    public static ArrayList<String> convert(String s) {
        String[] strSplit = s.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strSplit));
        return strList;
    }
}
