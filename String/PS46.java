package String;

import java.util.ArrayList;

public class PS46 {
    public static void main(String[] args) {
        String[] strings = { "alic3", "bob", "3", "4", "00000" };
        System.out.println(maximumValue(strings));
    }

    public static int maximumValue(String[] strs) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            Boolean fBoolean = true;
            String string = strs[i];
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                if (Character.isLetter(c)) {
                    arrayList.add(strs[i].length());
                    fBoolean = false;
                    break;
                }
            }
            if (fBoolean) {
                int number = Integer.parseInt(string);
                arrayList.add(number);
            }
        }
        
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}