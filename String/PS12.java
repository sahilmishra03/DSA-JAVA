package String;

import java.util.ArrayList;
import java.util.List;

public class PS12 {
    public static void main(String[] args) {
        String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
        String[] words2 = { "lo", "eo" };

        List<String> resultList = wordSubsets(words1, words2);
        System.out.println(resultList);
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < words1.length; i++) {
            boolean isSubset = true;
            for (int j = 0; j < words2.length; j++) {
                if (!words1[i].contains(words2[j])) {
                    isSubset = false;
                    break;
                }
            }

            if (isSubset) {
                resultList.add(words1[i]);
            }
        }
        return resultList;
    }
}
