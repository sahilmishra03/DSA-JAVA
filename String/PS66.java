package String;

import java.util.ArrayList;

public class PS66 {
    public static void main(String[] args) {
        String s = new String("a good  example");
        String[] arr = s.split(" ");

        ArrayList<String> arrayList = new ArrayList<>();

        for (String string : arr) {
            if (!string.equals("")) {
                char c = string.charAt(0);
                int asciiValue = (int) c;
                if (asciiValue != 32) {
                    arrayList.add(string);
                }
            }
        }

        String res = new String();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            res += arrayList.get(i)+ " ";
        }

        System.out.println(res);
    }
}
