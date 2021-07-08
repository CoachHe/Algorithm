package Section8_数组和矩阵问题.第121题_买卖股票的最佳时机II;

public class Solution2 {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i-1][0] + prices[i], dp[i-1][1]);
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][1]);
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{7,1,5,3,6,4};
        int[] arr = new int[]{7,6,4,3,1};
        Solution2 s = new Solution2();
        System.out.println(s.maxProfit(arr));
    }
}
