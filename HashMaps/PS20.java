package HashMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class PS20 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> arrayList = new ArrayList<>();

        String[] s1A = s1.split(" ");
        String[] s2A = s2.split(" ");

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < s1A.length; i++) {
            if (hashMap1.containsKey(s1A[i])) {
                hashMap1.put(s1A[i], hashMap1.get(s1A[i]) + 1);
            } else {
                hashMap1.put(s1A[i], 1);
            }
        }

        for (int i = 0; i < s2A.length; i++) {
            if (hashMap2.containsKey(s2A[i])) {
                hashMap2.put(s2A[i], hashMap2.get(s2A[i]) + 1);
            } else {
                hashMap2.put(s2A[i], 1);
            }
        }

        Set<String> set1 = hashMap1.keySet();
        for (String string : set1) {
            if (hashMap1.get(string) == 1 && !hashMap2.containsKey(string)) {
                arrayList.add(string);
            }
        }

        Set<String> set2 = hashMap2.keySet();
        for (String string : set2) {
            if (hashMap2.get(string) == 1 && !hashMap1.containsKey(string)) {
                arrayList.add(string);
            }
        }

        String[] res = new String[arrayList.size()];
        int index = 0;
        for (String string : arrayList) {
            res[index] = string;
            index++;
        }

        return res;
    }
}