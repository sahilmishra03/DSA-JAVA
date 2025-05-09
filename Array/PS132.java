package Array;

import java.util.ArrayList;

public class PS132 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println(maximizeSum(nums, k));
    }

    public static int maximizeSum(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer integer : nums) {
            arrayList.add(integer);
        }

        int res = 0;
        int count = 0;

        while (count < k) {
            int idx =0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arrayList.size(); i++) {
                if (max<arrayList.get(i)) {
                    max=arrayList.get(i);
                    idx=i;
                }
            }

            arrayList.remove(idx);
            res += max;
            arrayList.add(max + 1);
            count++;
        }

        return res;
    }
}
