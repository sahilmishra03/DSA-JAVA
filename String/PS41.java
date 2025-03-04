package String;

public class PS41 {
    public static void main(String[] args) {
        String string = "poiinter";
        System.out.println(finalString(string));
    }

    public static String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='i') {
                stringBuilder.reverse();
            }else{
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
