package String;

import java.util.Arrays;

public class PS61 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    int cal = Math.abs(i - j);
                    min = Math.min(min, cal);
                }
            }
            res[i] = min;
        }
        return res;
    }
}