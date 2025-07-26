package Array;

import java.util.ArrayList;

public class PS158 {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        System.out.println(minimumPairRemoval(nums));
    }

    public static int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(nums[i]);
        }

        int count = 0;

        while (!isSorted(arrayList)) {
            int min = Integer.MAX_VALUE;
            int idx1 = 0;
            int idx2 = 0;

            for (int i = 1; i < arrayList.size(); i++) {
                int sum = arrayList.get(i) + arrayList.get(i - 1);
                if (min > sum) {
                    min = sum;
                    idx1 = i;
                    idx2 = i - 1;
                }
            }

            if (idx1 > idx2) {
                arrayList.remove(idx1);
                arrayList.remove(idx2);
            } else {
                arrayList.remove(idx2);
                arrayList.remove(idx1);
            }

            arrayList.add(min);
            count++;
        }

        return count;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i))
                return false;
        }
        return true;
    }
}
