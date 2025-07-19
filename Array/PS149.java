package Array;

public class PS149 {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i]<prices[j]) {
                    int value = prices[j]-prices[i];
                    res= Math.max(res, value);
                }
            }
        }

        return res;
    }
}
