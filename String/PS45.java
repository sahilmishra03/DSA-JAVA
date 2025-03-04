package String;
public class PS45 {
    public static void main(String[] args) {
        String wString = "234Adas";
        System.out.println(isValid(wString));
    }

    public static boolean isValid(String word) {
        int charactersCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int cInt = c;
            if ((cInt >= 65 && cInt <= 90) || (cInt >= 97 && cInt <= 122)) {
                charactersCount++;
            }
        }
        
        int digitCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int cInt = c;
            if (cInt >= 48 && cInt <= 57) {
                digitCount++;
            }
        }
        
        String vowels = "aeiouAEIOU";
        Boolean vowelsFlag = false;
        Boolean consonantFlag = false;
        for (int i = 0; i < word.length(); i++) {
            char c1 = word.charAt(i);
            for (int j = 0; j < vowels.length(); j++) {
                char c2 = vowels.charAt(j);
                if (c1 == c2) {
                    vowelsFlag = true;
                } else {
                    consonantFlag = true;
                }
            }
        }
        
        if (charactersCount >= 3) {
            if (digitCount != 0) {
                if (vowelsFlag) {
                    if (consonantFlag) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
}