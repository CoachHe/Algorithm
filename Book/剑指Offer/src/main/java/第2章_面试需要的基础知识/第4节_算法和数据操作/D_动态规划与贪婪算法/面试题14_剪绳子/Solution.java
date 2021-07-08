package 第2章_面试需要的基础知识.第4节_算法和数据操作.D_动态规划与贪婪算法.面试题14_剪绳子;


//用动态规划解决
public class Solution {
    public int cutRope(int target) {
        if (target <= 1) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int[] res = new int[target + 1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;
        for (int i = 4; i <= target; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= i / 2; j++) {
                max = Math.max(res[j] * res[i - j], max);
            }
            res[i] = max;
        }
        return res[target];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.cutRope(10));
    }
}