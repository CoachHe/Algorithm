package Section8_数组和矩阵问题.第123题_买卖股票的最佳时机3;

public class Solution {
    public int maxProfit(int[] price) {
        // dp[天数][当前是否持股][卖出的次数] 不持股为0，持股为1
        int[][][] dp = new int[price.length][2][3];
        dp[0][1][0] = - price[0];
        dp[0][1][2] = Integer.MIN_VALUE;
        dp[0][1][1] = Integer.MIN_VALUE;
        for (int i = 1; i < price.length; i++) {
            dp[i][0][1] = max(dp[i-1][1][0] + price[i], dp[i-1][0][1]);
            dp[i][0][2] = max(dp[i-1][1][1] + price[i], dp[i-1][0][2]);
            dp[i][1][0] = max(dp[i-1][1][0], dp[i-1][0][0] - price[i]);
            dp[i][1][1] = max(dp[i-1][1][1], dp[i-1][0][1] - price[i]);
        }
        return max(dp[price.length - 1][0][1], dp[price.length - 1][0][2], 0);
    }

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        int[] price = new int[]{1, 2, 3, 4, 5};
        Solution s = new Solution();
        System.out.println(s.maxProfit(price));
    }
}
