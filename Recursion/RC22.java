package Recursion;

import java.util.ArrayList;

public class RC22 {
    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int index = 0; index < str.length(); index++) {
            char currChar = str.charAt(index);
            String newStr = str.substring(0, index) + str.substring(index + 1);
            printPermutation(newStr, perm + currChar, idx + 1);
        }
    }

    public static void printPermutationArrayList(String str, String perm, int idx, ArrayList<String> result) {
        if (str.length() == 0) {
            if(!perm.isEmpty()){
                result.add(perm);
            }
            return;
        }
        for (int index = 0; index < str.length(); index++) {
            char currChar = str.charAt(index);
            String newStr = str.substring(0, index) + str.substring(index + 1);
            printPermutationArrayList(newStr, perm + currChar, idx + 1,result);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> result = new ArrayList<>();
        printPermutationArrayList(str, "", 0,result);
        System.out.println(result);
    }
}