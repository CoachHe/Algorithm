package Section8_数组和矩阵问题.第121题_买卖股票的最佳时机II;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int tmpmax = prices[0];
        int tmpmin = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > tmpmax) {
                if (res < prices[i] - tmpmin) {
                    res = prices[i] - tmpmin;
                }
                tmpmax = prices[i];
            } else if (prices[i] <= tmpmax && prices[i] >= tmpmin) {
                continue;
            } else {
                tmpmin = prices[i];
                tmpmax = prices[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{6,5,4,8,6,8,7,8,9,4,5}));
    }

}
