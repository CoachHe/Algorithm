package Section4_递归和动态规划.A2_台阶问题的递归和动态规划;

public class Solution_Recursive {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
