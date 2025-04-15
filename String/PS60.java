package String;

public class PS60 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, haystack.length()).startsWith(needle)) {
                return i;
            }
        }
        return -1;
    }
}