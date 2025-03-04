package Array;

import java.util.*;

public class PS51 {
    public static void main(String[] args) {
        String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
        String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
        String[] result = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, Integer> sHashMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    sHashMap.put(i, j);
                }
            }
        }
        ArrayList<String> strings = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Set<Integer> set = sHashMap.keySet();
        for (Integer integer : set) {
            if (min > integer + sHashMap.get(integer)) {
                min = integer + sHashMap.get(integer);
                strings.clear();
                strings.add(list1[integer]);
            } else if (min == integer + sHashMap.get(integer)) {
                min = integer + sHashMap.get(integer);
                strings.add(list1[integer]);
            }
        }
        String[] resultArray = new String[strings.size()];
        resultArray = strings.toArray(resultArray);
        return resultArray;
    }
}