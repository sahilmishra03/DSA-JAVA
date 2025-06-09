package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class PS04 {
    public static void main(String[] args) {
        int[][] pairs = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        System.out.println(findLongestChain(pairs));
    }

    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int maxChain = 1;
        int lastEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                maxChain++;
                lastEnd = pairs[i][1];
            }
        }
        return maxChain;
    }
}
