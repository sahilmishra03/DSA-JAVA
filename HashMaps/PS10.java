package HashMaps;
import java.util.HashMap;
import java.util.HashSet;
public class PS10 {
    public static void main(String[] args) {
        int[] nums = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.println(uniqueOccurrences(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int freq : hashMap.values()) {
            if (!hashSet.add(freq)) {
                return false;
            }
        }

        return true;
    }
}
