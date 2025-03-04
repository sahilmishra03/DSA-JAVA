package String;

import java.util.*;

public class PS43 {
    public static void main(String[] args) {
        String[] arrStrings = { "d", "b", "c", "b", "c", "a" };
        int k = 2;
        System.out.println(kthDistinct(arrStrings, k));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        String res = new String();
        Boolean fBoolean = false;
        Set<String> set = hashMap.keySet();
        for (String string : set) {
            for (int i = 0; i < arr.length; i++) {
                if (k>hashMap.size()) {
                    break;
                }
                if (hashMap.get(string) == 1 && string == arr[i]) {
                    res += string;
                    fBoolean = true;
                    break;
                }
            }
            if (fBoolean) {
                break;
            }
        }
        return res;
    }
}