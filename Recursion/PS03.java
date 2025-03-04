package Recursion;

import java.util.ArrayList;

public class PS03 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(m1(s));
    }

    public static ArrayList<String> m1(String s) {
        if (s.isEmpty()) {
            ArrayList<String> aList = new ArrayList<>();
            aList.add("");
            return aList;
        }

        char cc = s.charAt(0); // Current character
        String string = s.substring(1); // Remaining string

        ArrayList<String> mHelpeArrayList = m1(string); // Recursive call
        ArrayList<String> mArrayList = new ArrayList<>();

        for (String str : mHelpeArrayList) {
            mArrayList.add(str); // Add the subset without the current character
            mArrayList.add(cc + str); // Add the subset with the current character
        }

        return mArrayList;
    }
}
