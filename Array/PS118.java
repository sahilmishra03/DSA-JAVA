package Array;

import java.util.ArrayList;
import java.util.List;

public class PS118 {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        String string = "";
        for (int i = 0; i < num.length; i++) {
            String helper = String.valueOf(num[i]);
            string += helper;
        }

        int sum = Integer.parseInt(string) + k;
        List<Integer> result = new ArrayList<>();
        String utilString = String.valueOf(sum);
        for (int i = 0; i < utilString.length(); i++) {
            int utilInt = Integer.parseInt(String.valueOf(utilString.charAt(i)));
            result.add(utilInt);
        }

        return result;
    }
}