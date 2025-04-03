package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS93 {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 2, 3 };

        System.out.println(Arrays.toString(numberGame(nums)));
    }

    public static int[] numberGame(int[] nums) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                arrayList1.add(nums[i]);
            } else {
                arrayList2.add(nums[i]);
            }
        }

        int[] res = new int[nums.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrayList1.size() && j < arrayList1.size()) {
            res[k++] = arrayList2.get(i++);
            res[k++] = arrayList1.get(j++);
        }

        return res;
    }
}