package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS73 {
    public static void main(String[] args) {
        int[] nums = { 13, 25, 83, 77 };
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String string = String.valueOf(nums[i]);
            for (int j = 0; j < string.length(); j++) {
                char c = string.charAt(j);
                String s = String.valueOf(c);
                int value = Integer.parseInt(s);
                arrayList.add(value);
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}