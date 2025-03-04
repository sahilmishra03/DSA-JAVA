package Array;

import java.util.ArrayList;

public class PS66 {
    public static void main(String[] args) {
        int[] nums = { 18, 43, 36, 13, 7 };
        System.out.println(maximumSum(nums));
    }

    public static int maximumSum(int[] nums) {
        int res = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    int n1 = sumDigits(nums[i]);
                    int n2 = sumDigits(nums[j]);
                    if (n1 == n2) {
                        arrayList.add(nums[i] + nums[j]);
                    }
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (res < arrayList.get(i)) {
                res = arrayList.get(i);
            }
        }
        return res;
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}