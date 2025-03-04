package String;

public class PS21 {
    public static void main(String[] args) {
        String[] patternStrings = { "a", "abc", "bc", "d" };
        String wordString = "abc";
        System.out.println(numOfStrings(patternStrings, wordString));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                counter++;
            }
        }
        return counter;
    }
}