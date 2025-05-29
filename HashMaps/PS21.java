package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PS21 {
    public static void main(String[] args) {
        //2363 LC
        int[][] item1 = { { 1, 1 }, { 4, 5 }, { 3, 8 } };
        int[][] item2 = { { 3, 1 }, { 1, 5 } };
        System.out.println(mergeSimilarItems(item1, item2));
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < items1.length; i++) {
            hashMap.put(items1[i][0], items1[i][1]);
        }

        for (int i = 0; i < items2.length; i++) {
            if (hashMap.containsKey(items2[i][0])) {
                hashMap.put(items2[i][0], hashMap.get(items2[i][0]) + items2[i][1]);
            } else {
                hashMap.put(items2[i][0], items2[i][1]);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set = hashMap.keySet();
        for (Integer integer : set) {
            List<Integer> helper = new ArrayList<>();
            helper.add(integer);
            helper.add(hashMap.get(integer));

            result.add(helper);
        }

        return result;
    }
}
