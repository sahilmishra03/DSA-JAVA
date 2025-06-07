package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PS01 {
    // Activity Selection o(n)
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        int[][] act = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(act[0][0]);
        int lastEnd = act[0][2];
        for (int i = 0; i < act.length; i++) {
            if (act[i][1] >= lastEnd) {
                ans.add(act[i][0]);
                maxAct++;
                lastEnd = act[i][2];
            }
        }

        System.out.println(maxAct);
        System.out.println(ans);
    }
}