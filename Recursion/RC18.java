package Recursion;

import java.util.ArrayList;

public class RC18 {
    public static void print(ArrayList<Integer> subsets) {
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i));
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subsets) {
        if (n == 0) {
            print(subsets);
            return;
        }
        subsets.add(n);
        findSubsets(n - 1, subsets);

        subsets.remove(subsets.size() - 1);
        findSubsets(n - 1, subsets);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubsets(n, subsets);
    }
}
