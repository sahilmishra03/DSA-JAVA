package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class PS141 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 1, 7 };
        int[] queries = { 1, 3, 2, 4 };
        int x = 1;
        System.out.println(Arrays.toString(occurrencesOfElement(nums, queries, x)));
    }

    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                arrayList.add(i);
            }
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] > arrayList.size()) {
                result[i] = -1;
            } else {
                result[i] = arrayList.get(queries[i] - 1);
            }
        }

        return result;
    }
}