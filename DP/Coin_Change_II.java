package DP;

public class Coin_Change_II {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = { 1, 2, 5 };
        System.out.println(change(amount, coins));
    }

    public static int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }

        return memoization(coins, amount, n - 1, dp);
    }

    public static int memoization(int[] coins, int amount, int idx, int[][] dp) {
        if (idx == 0) {
            if (amount % coins[idx] == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }

        int pick = 0;
        if (amount >= coins[idx]) {
            pick = memoization(coins, amount - coins[idx], idx, dp);
        }

        int noPick = memoization(coins, amount, idx - 1, dp);

        dp[idx][amount] = pick + noPick;
        return dp[idx][amount];
    }
}
