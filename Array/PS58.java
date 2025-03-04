package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PS58 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (count != nums[i]) {
                list.add(count);
                count++;
            }
        }
        return list;
    }
}
