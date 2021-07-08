package Section4_递归和动态规划.A1_斐波那契数列问题的递归和动态规划;

public class Mine_Recursive {
    public int f1(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f1(n - 1) + f1(n - 2);
    }
}
