package String;

import java.util.ArrayList;

public class PS18 {
    public static void main(String[] args) {
        String string = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        System.out.println(areNumbersAscending(string));
    }

    public static boolean areNumbersAscending(String s) {
        Boolean fBoolean = false;
        String[] w = s.split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < w.length; i++) {
            String fString = w[i];
            for (int j = 0; j < fString.length(); j++) {
                char c = fString.charAt(j);
                int cInt = c;
                if (cInt >= 97 && cInt <= 122) {

                } else {
                    String string = String.valueOf(c);
                    int g1 = Integer.parseInt(string);
                    arrayList.add(g1);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < arrayList.get(+1)) {
                fBoolean = true;
            } else {
                break;
            }
        }
        return fBoolean;
    }
}