package HashMaps;

import java.util.*;

public class PS15 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4,3,4,6,0,9,5,8,2};
        int[] resultant = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(resultant));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        List<Integer> resultList = new ArrayList<>();
        for (Integer integer : hashMap.keySet()) {
            if (hashMap.get(integer) > 1) {
                resultList.add(integer);
            }
        }
        int[] resultant = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultant[i] = resultList.get(i);
        }
        return resultant;
    }
}