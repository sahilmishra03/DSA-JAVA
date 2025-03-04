package String;

public class PS09 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        char[] res = new char[s.length];
        int index = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            res[index] = s[i];
            index++;
        }
        for (int j = 0; j < res.length; j++) {
            s[j] = res[j];
        }
        for (int k = 0; k < res.length; k++) {
            System.out.println(s[k]);
        }
    }
}
