package HashMaps;

import java.util.*;

public class PS11 {
    public static void main(String[] args) {
        int[] nums = {0,3,2,1,3,2};
        int[] resultant = getSneakyNumbers(nums);
        System.out.println(Arrays.toString(resultant));
    }
    public static int[] getSneakyNumbers(int[] nums) {
        int[] resultant = new int[2];
        int index =0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        Set<Integer> integers = hashMap.keySet();
        for (Integer integer : integers) {
            if (hashMap.get(integer)==2) {
                resultant[index]=integer;
                index++;
            }
        }
        return resultant;
    }
}