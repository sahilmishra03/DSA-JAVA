package Array;

import java.util.Arrays;

public class PS157 {
    public static void main(String[] args) {
        String boxes = "001011";

        System.out.println(Arrays.toString(minOperations(boxes)));
    }

    public static int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];

        for (int i = 0; i < res.length; i++) {
            int valueAdd = 0;
            for (int j = 0; j < res.length; j++) {
                if (boxes.charAt(j) == '1') {
                    valueAdd += Math.abs(i - j);
                }
            }
            res[i] = valueAdd;
        }

        return res;
    }
}
