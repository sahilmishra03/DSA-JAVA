package Array;

import java.util.ArrayList;

public class PS75 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = nums.length;
        for (int index = 0; index < nums.length; index++) {
            if (n % (index + 1) == 0) {
                arrayList.add(nums[index]);
            }
        }
        int sum = 0;
        for (int index = 0; index < arrayList.size(); index++) {
            sum += arrayList.get(index) * arrayList.get(index);
        }
        return sum;
    }
}
