package Array;

import java.util.ArrayList;

public class PS178 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        int nums[] = { 3, 2, 1 };
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            out.add(temp);
        }

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                temp.add(nums[j]);
                out.add(temp);
            }
        }

        System.out.println(out);
    }
}
