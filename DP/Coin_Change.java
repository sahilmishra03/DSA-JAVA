package DP;

public class Coin_Change {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < amount + 1; j++) {
                dp[i][j] = -1;
            }
        }
        int res = Memoization(coins, amount, n - 1, dp);
        if (res == (int) (1e9)) {
            return -1;
        }

        return res;
        // return recur(coins, amount, n - 1);
    }

    public static int recur(int[] coins, int amount, int idx) {
        if (idx == 0) {
            if (amount % coins[idx] == 0) {
                return amount / coins[idx];
            }
            return (int) (1e9);
        }

        int pick = (int) (1e9);
        if (amount >= coins[idx]) {
            pick = 1 + recur(coins, amount - coins[idx], idx);
        }

        int noPick = 0 + recur(coins, amount, idx - 1);

        return Math.min(pick, noPick);
    }

    public static int Memoization(int[] coins, int amount, int idx, int[][] dp) {
        if (idx == 0) {
            if (amount % coins[idx] == 0) {
                dp[idx][amount] = amount / coins[idx];
                return amount / coins[idx];
            }
            dp[idx][amount] = (int) (1e9);
            return (int) (1e9);
        }
        if (dp[idx][amount] != -1) {
            return dp[idx][amount];
        }
        int pick = (int) (1e9);
        if (amount >= coins[idx]) {
            pick = 1 + Memoization(coins, amount - coins[idx], idx, dp);
        }

        int noPick = 0 + Memoization(coins, amount, idx - 1, dp);
        dp[idx][amount] = Math.min(pick, noPick);
        return dp[idx][amount];
    }
}
