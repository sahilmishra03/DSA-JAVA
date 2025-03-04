package Array;

import java.util.Arrays;

public class PS63 {
    public static void main(String[] args) {
        int[] prices = { 8, 4, 6, 2, 3 };
        System.out.println(Arrays.toString(finalPrices(prices)));
    }

    public static int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            res[i]=prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    res[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return res;
    }
}
