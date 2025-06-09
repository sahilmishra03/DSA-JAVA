package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class PS05 {
    public static void main(String[] args) {
        int value = 121;
        System.out.println(IndiaCoin(value));
    }

    public static int IndiaCoin(int value) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < value) {
                while (coins[i] <= value) {
                    cnt++;
                    value -= coins[i];
                }
            }
        }

        return cnt;
    }
}
