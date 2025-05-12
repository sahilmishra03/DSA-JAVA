package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PS134 {
    public static void main(String[] args) {
        int[][] nums = { { 3, 1, 2, 4, 5 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (hashMap.containsKey(nums[i][j])) {
                    hashMap.put(nums[i][j], hashMap.get(nums[i][j]) + 1);
                } else {
                    hashMap.put(nums[i][j], 1);
                }
            }
        }

        Set<Integer> set = hashMap.keySet();
        List<Integer> res = new ArrayList<>();
        for (Integer integer : set) {
            if (hashMap.get(integer) >= nums.length) {
                res.add(integer);
            }
        }

        Collections.sort(res);
        return res;
    }
}