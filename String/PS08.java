package String;

public class PS08 {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        Boolean result=isSubsequence(s,t);
        System.out.println(result);
    }

    public static boolean isSubsequence(String s, String t) {
        int strLength = s.length();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i)==t.charAt(j)){
                    count++;
                }
            }
        }
        if (strLength==count){
            return true;
        }
        return false;
    }
}
