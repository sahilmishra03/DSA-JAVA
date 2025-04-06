package Recursion;

import java.util.ArrayList;

public class RC08 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        getSSQV3(arr, 0, 0);
    }

    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char currentCharacter = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (String string : smallAns) {
            ans.add(string);
            ans.add(currentCharacter + string);
        }
        return ans;
    }

    static void getSSQV2(String s, String res) {
        if (s.length() == 0) {
            System.out.println(res);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        getSSQV2(remString, res + curr);
        getSSQV2(remString, res);
    }

    static void getSSQV3(int[] arr, int idx, int sum) {
        if (idx >= arr.length) {
            System.out.println(sum);
            return;
        }
        getSSQV3(arr, idx + 1, sum + arr[idx]);
        getSSQV3(arr, idx + 1, sum);
    }
}