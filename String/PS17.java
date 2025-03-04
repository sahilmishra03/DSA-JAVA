package String;

import java.util.ArrayList;

public class PS17 {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(getLucky(s, k));
    }

    public static int getLucky(String s, int k) {
        ArrayList<Integer> helpArrayList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int convertAsciiValue = c;
            int position = convertAsciiValue - 97 + 1;
            String poString = Integer.toString(position);
            for (int j = 0; j < poString.length(); j++) {
                char g = s.charAt(i);
                String string = String.valueOf(g);
                int g1 = Integer.parseInt(string);
                helpArrayList.add(g1);
            }
        }
        int count = 0;
        int sum = 0;
        while (count < k) {
            for (int i = 0; i < helpArrayList.size(); i++) {
                sum += helpArrayList.get(i);
            }
            count++;
        }
        return sum;
    }
}
