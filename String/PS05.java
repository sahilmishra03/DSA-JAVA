package String;

public class PS05 {
    public static void main(String[] args) {
        String s = "aeiouf";
        String newString = s.toLowerCase();
        String vowels = "aeiou";
        int c = 0;

        for (int i = 0; i < newString.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (newString.charAt(i)== vowels.charAt(j)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
