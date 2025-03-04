package String;

import java.util.ArrayList;
import java.util.List;

public class PS54 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        String string = new String();
        for (int i = 0; i < num.length; i++) {
            string += num[i];
        }
        int value1 = Integer.parseInt(string);
        int res = value1 + k;
        String string2 = String.valueOf(res);
        for (int i = 0; i < string2.length(); i++) {
            char c = string2.charAt(i);
            String string3 = String.valueOf(c);
            int value2 = Integer.parseInt(string3);
            list.add(value2);
        }
        return list;
    }
}