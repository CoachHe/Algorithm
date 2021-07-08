package Section4_递归和动态规划.A2_台阶问题的递归和动态规划;

public class Mine_Dynamic {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f_0 = 0;
        int f_1 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = f_0 + f_1;
            f_0 = f_1;
            f_1 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution_Dynamic s = new Solution_Dynamic();
        System.out.println(s.climbStairs(2));
    }
}
