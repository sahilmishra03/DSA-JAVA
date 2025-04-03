package Recursion;

import java.util.ArrayList;

public class PS12 {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqArrayList("", "abc"));
    }

    static void subseq(String r, String s) {
        if (s.isEmpty()) {
            System.out.println(r);
            return;
        }

        char c = s.charAt(0);

        subseq(r + c, s.substring(1));
        subseq(r, s.substring(1));
    }

    static ArrayList<String> subseqArrayList(String r, String s) {
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(r);
            return list;
        }

        char c = s.charAt(0);

        ArrayList<String> left = subseqArrayList(r + c, s.substring(1));
        ArrayList<String> right = subseqArrayList(r, s.substring(1));

        left.addAll(right);

        return left;
    }

    static void subseqArrayListArgs(String r, String s, ArrayList<String> res) {
        if (s.isEmpty()) {
            res.add(r);
            return;
        }

        char c = s.charAt(0);

        subseqArrayListArgs(r + c, s.substring(1), res);
        subseqArrayListArgs(r + c, s.substring(1), res);
    }
}
