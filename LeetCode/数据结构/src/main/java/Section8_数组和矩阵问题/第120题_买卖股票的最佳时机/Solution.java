package Section8_数组和矩阵问题.第120题_买卖股票的最佳时机;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > res) {
                res = prices[i] - min;
            }
            min = Math.min(min, prices[i]);
        }
        return Math.max(res, 0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
