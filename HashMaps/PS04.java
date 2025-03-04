package HashMaps;

import java.util.*;;

public class PS04 {

    public static void main(String[] args) {
        int[] nums = { 1,2,2,3,3,3 };
        System.out.println(findLucky(nums));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hMap.containsKey(arr[i])) {
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            } else {
                hMap.put(arr[i], 1);
            }
        }
        int res = 0;
        Set<Integer> integers = hMap.keySet();
        for (Integer integer : integers) {
            if (integer == hMap.get(integer)) {
                res = integer;
            }
        }
        if (res>0) {
            return res;
        }
        else{
            return -1;
        }
    }
}