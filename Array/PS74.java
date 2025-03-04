package Array;

import java.util.ArrayList;

public class PS74 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1, 5, 4 };
        int k = 2;
        System.out.println(sumOfGoodNumbers(nums, k));
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int check1 = i - k;
            int check2 = i + k;
            
            if (check1 < 0) {
                if (check2 < nums.length && nums[check2] < nums[i]) { 
                    arrayList.add(nums[i]);
                }
            } else if (check2 >= nums.length) {
                if (nums[check1] < nums[i]) {
                    arrayList.add(nums[i]);
                }
            } else {
                if (nums[check1] < nums[i] && nums[check2] < nums[i]) {
                    arrayList.add(nums[i]);
                }
            }
        }
        
        int sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        return sum;
    }
}
