package Section4_递归和动态规划.第509题_斐波那契数;

public class Solution_Dynamic {
    public int fib(int N) {
        int f_0 = 0;
        int f_1 = 1;
        int ans = 0;
        if (N == 0 || N == 1) {
            return N;
        }
        for (int i = 2; i <= N; i++) {
            ans = f_0 + f_1;
            f_0 = f_1;
            f_1 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_Dynamic s = new Solution_Dynamic();
        System.out.println(s.fib(4));
    }
}
