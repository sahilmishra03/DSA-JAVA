package String;
public class PS04 {
    public static void main(String[] args) {
            String s1 = "abcd";
            String s2 = "badcz";
            int[] arrForS2 = new int[26];
            int[] arrForS1 = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                int index = s1.charAt(i);
                int arrIndex = index - 97;
                arrForS1[arrIndex]++;
            }
            for (int i = 0; i < s2.length(); i++) {
                int index = s2.charAt(i);
                int arrIndex = index - 97;
                arrForS2[arrIndex]++;
            }
            int flag = 1;
            for (int i = 0; i < arrForS1.length; i++) {
                if (arrForS1[i] != arrForS2[i]) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println("It is a anagram");
            } else {
                System.out.println("It is not a anagram");
            }
    }
}
