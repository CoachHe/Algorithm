package Section4_递归和动态规划.第1137题_第N个斐波那契数;

public class Solution_Dynamic {
    public int tribonacci(int n) {
        int f_0 = 0;
        int f_1 = 1;
        int f_2 = 1;
        int ans = 0;
        if (n <= 2) {
            return n == 2 ? 1 : n;
        }
        for (int i = 3; i <= n; i++) {
            ans = f_0 + f_1 + f_2;
            f_0 = f_1;
            f_1 = f_2;
            f_2 = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution_Dynamic s = new Solution_Dynamic();
        System.out.println(s.tribonacci(25));
    }
}
