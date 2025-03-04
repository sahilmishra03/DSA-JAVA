package String;

public class PS42 {
    public static void main(String[] args) {
        String string = "G()(al)";
        System.out.println(interpret(string));
    }

    public static String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = "G";
        for (int i = 0; i < command.length(); i++) {
            char c1 = command.charAt(i);
            if (String.valueOf(c1).equals(s1)) {
                stringBuilder.append(s1);
            } else if (i + 1 < command.length() && command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                stringBuilder.append("o");
                i++;
            } else if (i + 3 < command.length() && command.charAt(i) == '(' && command.charAt(i + 1) == 'a'
                    && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                stringBuilder.append("al");
                i += 3;
            }
        }
        return stringBuilder.toString();
    }
}