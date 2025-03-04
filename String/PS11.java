package String;

public class PS11 {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (index < spaces.length && i == spaces[index]) {
                stringBuilder.insert(i, " ");
                index++;
                i++;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
