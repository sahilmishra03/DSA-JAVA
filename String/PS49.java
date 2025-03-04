package String;

public class PS49 {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = title.toLowerCase().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > 2) {
                char c = strings[i].charAt(0);
                String s2 = String.valueOf(c).toUpperCase();
                stringBuilder.append(s2).append(strings[i].substring(1));
            } else {
                stringBuilder.append(strings[i]);
            }
            if (i != strings.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}