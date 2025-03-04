package String;

public class PS52 {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        Boolean rBoolean = true;
        if (s.contains("ba")) {
            rBoolean=false;
        }
        return rBoolean;
    }
}
